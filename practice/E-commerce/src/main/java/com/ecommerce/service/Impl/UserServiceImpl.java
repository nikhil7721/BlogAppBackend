package com.ecommerce.service.Impl;

import java.util.Date;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.ecommerce.dto.request.NewUserRequest;
import com.ecommerce.model.Address;
import com.ecommerce.model.Authority;
import com.ecommerce.model.Buyer;
import com.ecommerce.model.Seller;
import com.ecommerce.repository.AddressRepository;
import com.ecommerce.repository.AuthorityRepository;
import com.ecommerce.repository.CartItemRepository;
import com.ecommerce.repository.UserRepository;
import com.ecommerce.service.UserService;


@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private PasswordEncoder passwordEncoder;
	
	@Autowired
	private AuthorityRepository authorityRepository;
	
	@Autowired
	 private CartItemRepository cartRepository;
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private AddressRepository addressRepository;

	@Override
	public String createNewAccount(NewUserRequest newUserRequest) {
		ModelMapper modelMapper=new ModelMapper();
		Address address=modelMapper.map(newUserRequest,Address.class);
		if(newUserRequest.getIsAdmin()) {
			Seller seller=modelMapper.map(newUserRequest,Seller.class);
			seller.setPassword(passwordEncoder.encode(seller.getPassword()));
			seller.setCreatedAt(new Date());
			Authority authority=authorityRepository.findByRoleCode("Admin");
			if(authority==null) {
				seller.addAuthority().add(createAuthority("ADMIN","AdminRole"));
			}
			else {
				seller.addAuthority().add(authority);
			}
//			userRepository.save(seller)
			address.setUser(userRepository.save(seller));
			addressRepository.save(address);
			return"New account create succesfully...";
		}
		else {
			Buyer buyer=modelMapper.map(newUserRequest,Buyer.class);
			buyer.setPassword(passwordEncoder.encode(buyer.getPassword()));
			buyer.setCreatedAt(new Date());
			Authority authority=authorityRepository.findByRoleCode("User");
			if(authority==null) {
				buyer.addAuthority().add(createAuthority("User", "User role"));
			}else
			{
				buyer.addAuthority().add(authority);
			}
			address.setUser(userRepository.save(buyer));
			addressRepository.save(address);
			return "new account create successfully...";
		}
	}

	@Override
	public String updateUserRecord(NewUserRequest newUserRequest, int userId) {
		return null;
	}
	
	private Authority createAuthority(String roleCode,String roleDescription) {
		Authority authority=new Authority();
		authority.setRoleCode(roleCode);
		authority.setRoleDescription(roleDescription);
		return authorityRepository.save(authority);
	}

}
