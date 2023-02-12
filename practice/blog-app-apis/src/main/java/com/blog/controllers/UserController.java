package com.blog.controllers;

import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.blog.payloads.ApiResponse;
import com.blog.payloads.UserDto;
import com.blog.services.UserService;

@RestController
@RequestMapping("/api/users")
public class UserController {
	
	@Autowired
	private UserService userService;
	
		//post-create user
	@PostMapping("/")
		public ResponseEntity<UserDto> createUser(@Valid @RequestBody UserDto userDto)
		{
		UserDto createUserDto=this.userService.createUser(userDto);
		return new ResponseEntity<UserDto>(createUserDto,HttpStatus.CREATED);
		}
	
		
		//put-update user
	@PutMapping("/{userId}")
		public ResponseEntity<UserDto> updateUer(@Valid @RequestBody UserDto userDto,@PathVariable Integer userId)
		{
		UserDto updateduser	=this.userService.updateUser(userDto, userId);
		return ResponseEntity.ok(updateduser);
		}
	
	
	
	//delete-delete user
	@PreAuthorize("hasRole('Admin')")
	@DeleteMapping("/{userId}")
		public ResponseEntity<ApiResponse>deleteuser(@PathVariable Integer userId)
		{
		this.userService.deleteUser(userId);
		return new ResponseEntity<ApiResponse>(new ApiResponse("user deleted successfully",true),HttpStatus.OK);
		}
	

		//get-user get
	@GetMapping("/")
		public ResponseEntity<List<UserDto>> getAllUsers()
		{
		return ResponseEntity.ok(this.userService.getAllUsers());
		}
	
	 
		//get-single user get
	@GetMapping("/{userId}")
		public ResponseEntity<UserDto> getSingleUser(@PathVariable Integer userId)
		{
		return ResponseEntity.ok(this.userService.getUserById(userId));
		}

}
