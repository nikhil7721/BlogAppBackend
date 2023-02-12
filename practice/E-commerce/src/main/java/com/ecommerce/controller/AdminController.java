package com.ecommerce.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.model.Product;
import com.ecommerce.service.ProductService;

@RestController
@RequestMapping("/Admin")
public class AdminController {
	
	@Autowired
	private ProductService productService;
	
	@PostMapping("/addProduct")
	public ResponseEntity<String>addNewProduct(@RequestBody Product product){
		return new ResponseEntity<String>(productService.adddNewProduct(product),HttpStatus.CREATED);
	}
	
	@GetMapping("/allProduct")
	public ResponseEntity<?>getAllProducts(){
		return ResponseEntity.ok(productService.getAllproduct());
	}
	
//	@GetMapping("/getAllProductBySeller/{sellerId}")
//	public ResponseEntity<?>getAllProductBySeller(@PathVariable int productId,@PathVariable int sellerId){
//		return ResponseEntity.ok(productService.getAllProductBySeller(sellerId));
//	}
	
	@DeleteMapping("/deleteProduct/{productId}")
	public ResponseEntity<String>deleteProduct(@PathVariable int productId){
		productService.deleteProduct(productId);
		return new  ResponseEntity<>("Deleted Successfully",HttpStatus.ACCEPTED);
	}
	
	@GetMapping("/product/{productId}/{sellerId}")
	public ResponseEntity<Product>getProductById(@PathVariable int productId){
		return new ResponseEntity<Product>(productService.getProductById(productId),HttpStatus.OK);
	}

}
