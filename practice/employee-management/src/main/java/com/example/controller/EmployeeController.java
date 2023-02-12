package com.example.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.EmployeeEntity;
import com.example.service.EmpolyeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
	
	private final EmpolyeeService empolyeeService;
	
	public EmployeeController(EmpolyeeService empolyeeService) {
		this.empolyeeService=empolyeeService;
	}
	
	@GetMapping
	public List<EmployeeEntity>findAllEmployee(){
		return empolyeeService.findAllEmployee();
	}

	@GetMapping("/{id}")
	public Optional<EmployeeEntity> findEmployeebyId(@PathVariable("id")long id){
		return empolyeeService.findById(id);
	}
	
	@PostMapping("/add")
	public EmployeeEntity saveEmployee(@RequestBody EmployeeEntity employeeEntity) {
	return empolyeeService.saveEmployee(employeeEntity);
	}
	
	
	@PutMapping
	public EmployeeEntity updateEmployee(@RequestBody EmployeeEntity employeeEntity) {
		
		return empolyeeService.updateEmployee(employeeEntity);
	}
	
	@DeleteMapping
	public void deleteEmployee(@PathVariable("id") Long id) {
		empolyeeService.deleteEmployee(id);
	}
}
