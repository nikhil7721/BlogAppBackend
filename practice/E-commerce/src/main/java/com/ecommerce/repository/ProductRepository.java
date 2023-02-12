package com.ecommerce.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecommerce.model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer>{
//  public List<Product> findBySellerId(Integer userId);
}
