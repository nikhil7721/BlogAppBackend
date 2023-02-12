package com.admin.service;

import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.admin.entity.Adminentity;
import com.admin.repository.AdminRepository;


@Service
public class AdminServiceImpl implements adminService,UserDetailsService {
	
	@Autowired
	private AdminRepository adminRepository;
	
	@Autowired
	private BCryptPasswordEncoder pwdEncoder;
	

	@Override
	public Integer saveuser(Adminentity adminentity) {
		// Auto-generated method stub
		
		adminentity.setPassword(
		pwdEncoder.encode(
				adminentity.getPassword())
		);
				
		
		return adminRepository.save(adminentity).getId();
	}

	@Override
	public Optional<Adminentity> findByUsername(String username) {
		
		return adminRepository.findByUsername(username);
	}

	@Override
	public UserDetails loadUserByUsername(String username)
			throws UsernameNotFoundException 
	{
		Optional<Adminentity> opt =findByUsername(username);
		if(opt.isEmpty())
			throw new UsernameNotFoundException("user not exist");
		
		Adminentity adminEntity=opt.get();
		return new org.springframework.security.core.userdetails.User(
				username,
				adminEntity.getPassword(),
				adminEntity.getRoles().stream()
				.map((role->new SimpleGrantedAuthority(role)))
				.collect(Collectors.toList())		
				);
				
				
				
	}
	
}
