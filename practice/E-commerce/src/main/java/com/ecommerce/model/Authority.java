package com.ecommerce.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.security.core.GrantedAuthority;


import lombok.Getter;
import lombok.Setter;

@Table(name="Auth_AUTHORITY")
@Entity
@Getter
@Setter
public class Authority implements GrantedAuthority {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Column(name="ROLE_CODE")
	private String roleCode;
	
	@Column(name="ROLE_DESCRIPTION")
	private String roleDescription;
	

	@Override
	public String getAuthority() {
	return roleCode;
	}

}
