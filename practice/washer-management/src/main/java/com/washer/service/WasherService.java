package com.washer.service;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.washer.entity.WasherEntity;
import com.washer.repository.washerRepository;

@Service
public class WasherService {
	
	@Autowired
	private washerRepository washerRepository;
	
	
	public WasherEntity addwasher(@RequestBody WasherEntity washerEntity) {
		return washerRepository.save(washerEntity);		
	}
	
	public List<WasherEntity> getwasher(){
		List<WasherEntity>list=washerRepository.findAll();
		return list;
	}
	
	public void deleteById(@PathVariable int id) {
		washerRepository.deleteById(id);
	}
	
	
	public WasherEntity updatewasher(int id,WasherEntity washerEntity) {
		return washerRepository.save(washerEntity);
	}
	
	public Optional<WasherEntity> findById(int id){
		return washerRepository.findById(id);
	}

}
