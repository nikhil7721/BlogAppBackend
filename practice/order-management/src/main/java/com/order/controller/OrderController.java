package com.order.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.order.entity.OrderEntity;
import com.order.entity.washpacks;
import com.order.repository.OrderRepository;
import com.order.repository.washpackRepository;
import com.order.service.orderService;

@RestController
@RequestMapping("/order")
public class OrderController {
	
	@Autowired
	private orderService orderService;
	
	@Autowired
	public OrderRepository orderRepository;
	
	@Autowired
	public washpackRepository washpackRepository;
	
	
	
	@PostMapping("/addorder")
	public String saveorder(@RequestBody OrderEntity orderEntity) {
		 orderService.addorder(orderEntity);
		return "Order is Placed with Washer and will be Proceesed soon" + orderEntity;
	}
	
	@GetMapping("/allorders")
	public List<OrderEntity> getorders(){
		List<OrderEntity>list=orderService.getorders();
		return list;
	}
	
	@DeleteMapping()
	public String deleteById(@PathVariable int id) {
		orderService.deleteById(id);
		return "deleted with id " + id ;
	}
	
	@PostMapping("/addpack")
	public String savepack(@RequestBody washpacks washpacks) {
		washpackRepository.save(washpacks);
		return "pack save successfully with id" + washpacks.getId();
	}
	
	@GetMapping("/washpacks")
	public List<washpacks> allwashpacks(){
		List<washpacks>list=washpackRepository.findAll();
		return list;
	}

}
