package com.washer.controller;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.washer.entity.CustomerEntity;
import com.washer.entity.WasherEntity;
import com.washer.service.WasherService;

@RestController
@RequestMapping("/washer")
public class WasherController {
	
	@Autowired
	private WasherService washerService;
	
	@Autowired
	private RestTemplate restTemplate;
	
	@PostMapping("/addwasher")
	public WasherEntity addwasher(@RequestBody WasherEntity washerEntity) {
		return washerService.addwasher(washerEntity);
	}
	
	@GetMapping("/allwashers")
	public List<WasherEntity> getwasher(){
		List<WasherEntity>list=washerService.getwasher();
		return list;
	}
	
	@DeleteMapping("/deletewasher")
    public void deleteById(@PathVariable int id) {
    	washerService.deleteById(id);
    }
	
	public WasherEntity updatewasher(int id, WasherEntity washerEntity) {
		return washerService.updatewasher(id, washerEntity);
	}
	
	public Optional<WasherEntity> findById(int id){
		return washerService.findById(id);
	}
	
	@GetMapping("/getcustomer")
	public List<CustomerEntity> getcustomer(){
		String baseurl="http://localhost:8085/customer/getcustomer";
		CustomerEntity[]getcustomer=restTemplate.getForObject(baseurl,CustomerEntity[].class);
		return Arrays.asList(getcustomer);
	}
	
	
}
