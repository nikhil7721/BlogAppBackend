package com.ecommerce.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.model.Product;
import com.ecommerce.model.Seller;
import com.ecommerce.repository.ProductRepository;
import com.ecommerce.repository.UserRepository;
import com.ecommerce.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private ProductRepository productRepository;

	@Override
	public String adddNewProduct(Product product) {
//		Seller seller=(Seller)userRepository.findById(sellerId).get();
//		product.setSeller(seller);
		productRepository.save(product);
		// TODO Auto-generated method stub
		return "Product Added Successfully..";
	}

	@Override
	public List<Product> getAllproduct() {
		return productRepository.findAll();
	}


	@Override
	 public void  deleteProduct(int productId) {
//		List<Product>list=productRepository.findBySellerId(sellerId);
//		boolean isAvailable=false;
//		for(Product p:list) {
//			if(p.getId()==productId) {
//				isAvailable=true;
//				break;
//			}
//		}
//		if(isAvailable) {
//			productRepository.deleteById(productId);
//			return "product delete successfully..";
//		}
		  this.productRepository.deleteById(productId);
		
	}

	@Override
	public Product getProductById(int productId) {
		return productRepository.findById(productId).get();
	}

	@Override
	public String updateProduct(int productId, Product product) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String updatePrice(int productId, double price) {
		// TODO Auto-generated method stub
		return null;
	}

}
