package com.admin.service;

import java.util.Optional;

import com.admin.entity.Adminentity;


public interface adminService {
	
	Integer saveuser(Adminentity adminentity);
	Optional <Adminentity>findByUsername(String username);

}
