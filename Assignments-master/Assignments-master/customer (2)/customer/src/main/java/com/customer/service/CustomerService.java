package com.customer.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.customer.model.Customer;
import com.customer.repository.CustomerRepository;

@Service
public class CustomerService {
	
	
	@Autowired
	private CustomerRepository customerRepository1;
	
	//add customer
	
	public Customer addcustomer(@RequestBody Customer customer ) {
		return customerRepository1.save(customer);
	}
		
	//getmapping	
	public List<Customer> getcustomer() {
		List<Customer> list=customerRepository1.findAll();
		return list;
	}
	
	//delete
	public void deletebyId(@PathVariable int id) {
		customerRepository1.deleteById(id);
	}

	//update
	
	public Customer updatecustomer(@PathVariable int id ,@RequestBody Customer customer) {
		return customerRepository1.save(customer);
	}
}
