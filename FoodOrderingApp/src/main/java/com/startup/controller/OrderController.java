package com.startup.controller;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.startup.entity.Item;
import com.startup.entity.Order;
import com.startup.entity.OrderDetail;
import com.startup.repository.ItemRepository;
import com.startup.repository.OrderDetailRepository;
import com.startup.repository.OrderRepository;


@RestController
@RequestMapping(path = "/order")
public class OrderController {

	@Autowired
	OrderRepository oRepo;

	@Autowired
	ItemRepository iRepo;
	@Autowired
	OrderDetailRepository odRepo;

//	@PostMapping("/placeOrder")
//	public OrderDetail saveOrder(@RequestBody OrderDetail order) {
//		//order.setDate(LocalDateTime.now());
//		
//		
//		return odRepo.save(order);
//
//	}
	
	@PostMapping("/placeOrder")
	public void saveOrder(@RequestBody Order order) 
	{
		//order.setDate(LocalDateTime.now());
		//order.setOrderDetails(order.getOrderDetails());
		//order.setId(order.getOrderDetails().);
		
//		OrderDetail od=new OrderDetail(order.getOrderDetails());
//		
//		order.addOrderDetails(od);
		
		
//		System.out.println("order.getCustomer();:::::::::::::"+order.getCustomer());
//		System.out.println(order.getId());
		oRepo.save(order);
		
		 

	}
	
	@PostMapping("/insertItem")
	public Item insertItem(@RequestBody Item item) {
		//order.setDate(LocalDateTime.now());
		
		
		return iRepo.save(item);

	}
	
	
	
	
	
	
}