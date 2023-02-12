package com.washer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.washer.entity.WasherEntity;

@Repository
public interface washerRepository extends JpaRepository<WasherEntity,Integer> {

}
