package com.ecommerce.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.ecommerce.model.Product;

@Component
public interface ProductService {
	String adddNewProduct(Product product);
	List<Product>getAllproduct();
//	List<Product>getAllProductBy(int selllerId);
	void deleteProduct(int productId);
	Product getProductById(int productId);
	String updateProduct(int productId,Product product);
	String updatePrice(int productId,double price);

}
