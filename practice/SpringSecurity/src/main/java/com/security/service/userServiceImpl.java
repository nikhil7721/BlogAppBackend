package com.security.service;

import java.util.Optional;
import java.util.stream.Collectors;

import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.security.entity.UserEntity;
import com.security.repository.userRepository;

@Service
public class userServiceImpl implements userService,UserDetailsService{

	@Autowired
	private userRepository repo;
	
	@Autowired
	private BCryptPasswordEncoder pwdEncoder;
	
	@Override
	public Integer saveuser(UserEntity userentity) {
		// Auto-generated method stub
		
		userentity.setPassword(
		pwdEncoder.encode(
				userentity.getPassword())
		);
				
		
		return repo.save(userentity).getId();
	}

	@Override
	public Optional<UserEntity> findByUsername(String username) {
		
		return repo.findByUsername(username);
	}

	@Override
	public UserDetails loadUserByUsername(String username)
			throws UsernameNotFoundException 
	{
		Optional<UserEntity> opt =findByUsername(username);
		if(opt.isEmpty())
			throw new UsernameNotFoundException("user not exist");
		
		UserEntity userEntity=opt.get();
		return new org.springframework.security.core.userdetails.User(
				username,
				userEntity.getPassword(),
				userEntity.getRoles().stream()
				.map((role->new SimpleGrantedAuthority(role)))
				.collect(Collectors.toList())		
				);
				
				
				
	}
	
}


