package com.example.CustomerService.repo;


import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.CustomerService.entity.Orders;

public interface OrdersRepo extends MongoRepository<Orders, String>{
	

}
