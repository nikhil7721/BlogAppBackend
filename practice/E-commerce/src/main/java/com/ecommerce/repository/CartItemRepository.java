package com.ecommerce.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecommerce.model.Cart_items;

@Repository
public interface CartItemRepository extends JpaRepository<Cart_items,Integer> {
    Cart_items findByProductIdAndBuyerId(Integer product_id,Integer buyer_id);
}
