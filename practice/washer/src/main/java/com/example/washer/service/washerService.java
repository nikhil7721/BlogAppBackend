package com.example.washer.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.washer.model.Washer;
import com.example.washer.repository.washerRepository;

@Service
public class washerService {

	
	@Autowired
	private washerRepository washerRepository;
	
	//addwasher
	public Washer addwasher(Washer washer) {
		return washerRepository.save(washer);
		
	}
	
	//getwashers
	public List<Washer>getWashers(){
	List<Washer> washer=washerRepository.findAll();
	System.out.println("getting washers from Db"+washer);	
	return washer; 
	}
	
	//deletewasher
	public void deleteById(int id) {
		washerRepository.deleteById(id);
	}
}
