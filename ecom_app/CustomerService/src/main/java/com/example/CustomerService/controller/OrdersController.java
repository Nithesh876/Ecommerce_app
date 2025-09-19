package com.example.CustomerService.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.example.CustomerService.entity.Orders;
import com.example.CustomerService.repo.OrdersRepo;


@RestController
@RequestMapping("/Orders")
public class OrdersController {
	
	@Autowired
	private OrdersRepo ordersRepo;
	
	@PostMapping
	public Orders createOrders(@RequestBody Orders orders) {
		System.out.println("Post Success!!!");
		return ordersRepo.save(orders);
	}
	
	@GetMapping
	public List<Orders> getAllCustomers(){
		System.out.println("Get Success!!!");
		return ordersRepo.findAll();
	}
	
	@DeleteMapping("/{id}")
	public String deleteCustomer(@PathVariable String id) {		
		ordersRepo.deleteById(id);
		System.err.println("Delete Success!!!");
		return "Order deleted by id :- "+id;
	}
}
