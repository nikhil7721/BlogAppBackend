package com.customer.controller;

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

import com.customer.model.Customer;
import com.customer.repository.CustomerRepository;
import com.customer.service.CustomerService;

@RestController
@RequestMapping("/customer")
public class CustomerController {

	
	@Autowired 
	private CustomerService customerService;
	
	@PostMapping("/addcustomer")
	public Customer addcustomer(@RequestBody Customer customer) {
		return customerService.addcustomer(customer);
	}
	
    @GetMapping("/getcustomer")
    public List<Customer> getCustomers(){
    	return customerService.getcustomer();
    }
    
    @DeleteMapping("/delete/{id}")
    public String deleteCustomer(@PathVariable int id) {
    	customerService.deletebyId(id);
    	return "deleted with id"+id;
    }
    
    @PutMapping("/upadate/{id}")
    public Customer updatecustomer(@PathVariable int id,@RequestBody Customer customer) {
    	return customerService.updatecustomer(id, customer);
    }
    
}
