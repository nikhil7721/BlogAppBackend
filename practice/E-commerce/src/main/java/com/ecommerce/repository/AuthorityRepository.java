package com.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecommerce.model.Authority;

@Repository
public interface AuthorityRepository extends JpaRepository<Authority,Integer>{

	public Authority findByRoleCode(String roleCode);
}
