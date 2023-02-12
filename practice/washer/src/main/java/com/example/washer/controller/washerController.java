package com.example.washer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.washer.model.Washer;
import com.example.washer.repository.washerRepository;
import com.example.washer.service.washerService;

@RestController
@RequestMapping("/washer")
public class washerController {
	
	
	@Autowired 
	private washerService washerService;
	
	@Autowired
	private washerRepository washerRepository;
	
	
	@PostMapping("/addwasher")
	public Washer addwasher(@RequestBody Washer washer) {
		return washerRepository.save(washer);
	}
	
	@GetMapping("/allwashers")
	public List<Washer> findAllWashers(){
		return washerService.getWashers();
		
		

		
	}

}
