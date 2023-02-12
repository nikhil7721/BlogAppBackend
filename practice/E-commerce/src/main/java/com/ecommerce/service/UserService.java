package com.ecommerce.service;


import org.springframework.stereotype.Component;

import com.ecommerce.dto.request.NewUserRequest;

@Component
public interface UserService {

	public String createNewAccount(NewUserRequest newUserRequest);
	public String updateUserRecord(NewUserRequest newUserRequest,int userId);
}
