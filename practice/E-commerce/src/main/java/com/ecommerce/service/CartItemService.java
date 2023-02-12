package com.ecommerce.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.ecommerce.model.Cart_items;

@Component
public interface CartItemService {
	
	public String addProductToCart(int productId,int buyerId);
	public List<Cart_items> cartProducts(int buyerId);
	public String removeProductFromCartById(int productId,int buyerId );
    public String deleteProductFromCartById(int productId ,int buyerId);
}
