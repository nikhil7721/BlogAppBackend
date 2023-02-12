package com.ecommerce.service.Impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.model.Buyer;
import com.ecommerce.model.Cart_items;
import com.ecommerce.model.Product;
import com.ecommerce.repository.CartItemRepository;
import com.ecommerce.repository.ProductRepository;
import com.ecommerce.repository.UserRepository;
import com.ecommerce.service.CartItemService;

@Service
public class CartItemServiceImpl implements CartItemService{
	
	 @Autowired
	    private CartItemRepository cartRepository;

	    @Autowired
	    private ProductRepository productRepository;

	    @Autowired
	    private UserRepository userRepository;

	    @Override
	    public String addProductToCart(int productId, int buyerId) {
	        Buyer buyer =(Buyer)userRepository.findById(buyerId).get();
	        if(buyer.getCart_items().size() > 0){
	            boolean isPresent = false;
	            for(Cart_items c : buyer.getCart_items()){
	                if(c.getProduct().getId()==productId){
	                    c.setQuatity(c.getQuatity()+1);
	                    cartRepository.save(c);
	                    userRepository.save(buyer);
	                    isPresent = true;
	                    break;
	                }
	            }
	            if(!isPresent){
	                Product product = productRepository.findById(productId).get();
	                Cart_items cart_items = new Cart_items();
	                cart_items.setProduct(product);
	                cart_items.setQuatity(1);
	                cart_items.setBuyer(buyer);
	                buyer.getCart_items().add(cartRepository.save(cart_items));
	                userRepository.save(buyer);
	            }
	            return "Product added to cart";
	        }
	        Product product = productRepository.findById(productId).get();
	        Cart_items cart_items = new Cart_items();
	        cart_items.setProduct(product);
	        cart_items.setQuatity(1);;
	        cart_items.setBuyer(buyer);
	        buyer.getCart_items().add(cartRepository.save(cart_items));
	        userRepository.save(buyer);
	        return "Product added to cart";
	    }

	    @Override
	    public List<Cart_items> cartProducts(int buyerId) {
	        Buyer buyer =(Buyer)userRepository.findById(buyerId).get();
	        if(buyer.getCart_items().size() > 0){
	            return buyer.getCart_items();
	        }
	        return new ArrayList<>();
	    }

	    @Override
	    public String removeProductFromCartById(int productId, int buyerId) {
	        Cart_items cart_item = cartRepository.findByProductIdAndBuyerId(productId,buyerId);
	        if(cart_item != null){
	            if(cart_item.getQuatity() > 1){
	                cart_item.setQuatity(cart_item.getQuatity()-1);
	                cartRepository.save(cart_item);
	                return "Product removed successfully";
	            }
	            else {
	                deleteProductFromCartById(productId, buyerId);
	            }
	        }
	        return "Record not found";
	    }

	    @Override
	    public String deleteProductFromCartById(int productId, int buyerId) {
	        Buyer buyer =(Buyer)userRepository.findById(buyerId).get();
	        if(buyer.getCart_items().size() > 0){
	            List<Cart_items> list = buyer.getCart_items();
	            Cart_items cart_item = cartRepository.findByProductIdAndBuyerId(productId,buyerId);
	            list.remove(cart_item);
	            userRepository.save(buyer);
	            cartRepository.deleteById(cart_item.getCartId());
	        }
	        return "Product deleted from cart";
	    }
}
