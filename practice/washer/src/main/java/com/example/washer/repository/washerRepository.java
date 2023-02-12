package com.example.washer.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.washer.model.Washer;

public interface washerRepository extends MongoRepository <Washer,Integer>{

}
