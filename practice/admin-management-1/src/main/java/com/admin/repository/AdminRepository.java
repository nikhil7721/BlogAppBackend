package com.admin.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.admin.entity.Adminentity;


public interface AdminRepository extends JpaRepository<Adminentity, Integer> {
	
	Optional <Adminentity>findByUsername(String username);

}
