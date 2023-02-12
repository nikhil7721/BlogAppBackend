package com.example.service;

import java.util.List;
import java.util.Optional;

import com.example.entity.EmployeeEntity;

public interface EmpolyeeService {
	
	List<EmployeeEntity> findAllEmployee();
	Optional<EmployeeEntity> findById(Long id);
	EmployeeEntity saveEmployee(EmployeeEntity employeeEntity);
	EmployeeEntity updateEmployee(EmployeeEntity employeeEntity);
	void deleteEmployee(Long id);
		
	}


