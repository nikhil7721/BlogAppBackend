package com.customer.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.customer.entity.CustomerEntity;
import com.customer.entity.OrderEntity;
import com.customer.entity.WasherEntity;
import com.customer.entity.washpacks;
import com.customer.service.CustomerService;

@RestController
@RequestMapping("/customer")
public class CustomerController {
	
	
	
	@Autowired
	private CustomerService customerService;
	
	@Autowired
	private RestTemplate restTemplate;
	
	@PostMapping("/addcustomer")
	public CustomerEntity AddCustomer(@RequestBody CustomerEntity customerEntity) {
		return customerService.addCustomer(customerEntity);
	}
	
//	@GetMapping("/getcustomer")
//	public List<CustomerEntity> getcustomer(){
//		return customerService.getcustomer();
//		}
	
	@DeleteMapping("/delete/{id}")
	public String deleteCustomer(@PathVariable int id) {
		customerService.deleteById(id);
	   return "deleted with id"+id;
	}
	
	@PutMapping("/update/{id}")
	public CustomerEntity updateCustomer(@RequestBody CustomerEntity customerEntity,@PathVariable int id) {
		return customerService.updateCustomer(id, customerEntity);
	}
	
	@GetMapping("/allwasher")
	public List<WasherEntity> getwasher(){
		String baseurl="http://localhost:8086/washer/allwasher";
		WasherEntity[] getwasher=restTemplate.getForObject(baseurl, WasherEntity[].class);
	return Arrays.asList(getwasher);
	}
	
//	@GetMapping("/allorders")
//	public List<OrderEntity>getorders(){
//		String baseurl="http://localhost:8087/order/allorders";
//		OrderEntity[] getorders=restTemplate.getForObject(baseurl,OrderEntity[].class);
//		return Arrays.asList(getorders);
//	}
	
	@PostMapping("/addorder")
	public String saveorder(@RequestBody OrderEntity orderEntity) {
		return restTemplate.postForObject("http://localhost:8087/order/addorder", orderEntity, String.class);
	}
	
	@GetMapping("/washpacks")
   public List<washpacks>allwashpacks(){
	 String baseurl="http://localhost:8087/order/washpacks";
	 washpacks[]allwashpacks=restTemplate.getForObject(baseurl,washpacks[].class);
	 return Arrays.asList(allwashpacks);
   }
}
