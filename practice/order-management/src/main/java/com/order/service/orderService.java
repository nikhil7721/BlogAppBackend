package com.order.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.order.entity.OrderEntity;
import com.order.repository.OrderRepository;
import com.order.repository.washpackRepository;

@Service
public class orderService {
	
	@Autowired
	private OrderRepository orderRepository;
	
	@Autowired
	private washpackRepository washpackRepository;
	
	
	public OrderEntity addorder(OrderEntity orderEntity) {
		return orderRepository.save(orderEntity);
	}
	
	
	public List<OrderEntity> getorders(){
		List<OrderEntity> list=orderRepository.findAll();
		return list;
	}
	
	public void deleteById(int id) {
		orderRepository.deleteById(id);
	}
		
	
	

}
