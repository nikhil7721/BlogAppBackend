package com.customer.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.customer.entity.CustomerEntity;
import com.customer.repository.CustomerRepository;

@Service
public class CustomerService {

	@Autowired
	private CustomerRepository customerRepository;
	
	public CustomerEntity addCustomer(@RequestBody CustomerEntity customerEntity) {
	return customerRepository.save(customerEntity);
	}
	
	public List<CustomerEntity> getcustomer(){
		List<CustomerEntity>list=customerRepository.findAll();
		return list;
	}
	
	public void deleteById(@PathVariable  int id) {
		customerRepository.deleteById(id);
	}
	
	public CustomerEntity updateCustomer(int id,CustomerEntity customerEntity) {
		return customerRepository.save(customerEntity);
	}
	
	public Optional<CustomerEntity> findById(int id){
		return customerRepository.findById(id);
	}
	 
}
