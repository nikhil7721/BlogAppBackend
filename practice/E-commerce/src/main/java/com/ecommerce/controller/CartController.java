package com.ecommerce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.model.Cart_items;
import com.ecommerce.repository.CartItemRepository;
import com.ecommerce.service.CartItemService;

@RestController
@RequestMapping("/api/v1/user")
public class CartController {
    @Autowired
    private CartItemService cartItemService;
    @Autowired
    private CartItemRepository cartItemRepository;

    @PostMapping("/addProductToCart/{productId}/{buyerId}")
    public ResponseEntity<String> addProductToCart(@PathVariable int  productId, @PathVariable int buyerId){
        return new ResponseEntity<>(cartItemService.addProductToCart(productId, buyerId), HttpStatus.CREATED);
    }

    @GetMapping("/cart_products/{buyerId}")
    public ResponseEntity<List<Cart_items>> cartProducts(@PathVariable int buyerId){
        return new ResponseEntity<>(cartItemService.cartProducts(buyerId), HttpStatus.OK);
    }

    @DeleteMapping("/removeProductFromCartById/{productId}/{buyerId}")
    public ResponseEntity<String> removeProductFromCartById(@PathVariable int productId, @PathVariable int buyerId){
        return new ResponseEntity<>(cartItemService.removeProductFromCartById(productId, buyerId), HttpStatus.ACCEPTED);
    }

    @DeleteMapping("/deleteProductFromCartById/{productId}/{buyerId}")
    public ResponseEntity<String> deleteProductFromCartById(@PathVariable int productId,@PathVariable int buyerId){
        return new ResponseEntity<>(cartItemService.deleteProductFromCartById(productId, buyerId), HttpStatus.ACCEPTED);
    }


    @PostMapping("/demoRemove/{productId}/{buyerId}")
    public Cart_items remove(@PathVariable int productId,@PathVariable int buyerId){
        Cart_items cart_itemsList = cartItemRepository.findByProductIdAndBuyerId(productId,buyerId);
        System.out.println(cart_itemsList);
        return cart_itemsList;
    }


}
