package com.security.service;

import java.util.Optional;

import com.security.entity.UserEntity;

public interface userService {
	
	Integer saveuser(UserEntity userentity);
	Optional <UserEntity>findByUsername(String username);

}
