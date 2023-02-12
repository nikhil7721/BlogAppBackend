package com.security.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.security.entity.UserEntity;




public interface userRepository extends JpaRepository<UserEntity, Integer> {
	
 Optional <UserEntity>findByUsername(String username);

}
