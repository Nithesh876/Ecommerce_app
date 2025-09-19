package com.example.CustomerService.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.CustomerService.entity.Customer;

public interface CustomerRepo extends MongoRepository<Customer, String>{
	Customer findByEmail(String email);

}
