package com.example.CustomerService.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.CustomerService.entity.Customer;
import com.example.CustomerService.repo.CustomerRepo;


@RestController
@RequestMapping("/customers")
@CrossOrigin(origins = "http://localhost:3000")
public class CustomerController {
	
	@Autowired
	private CustomerRepo customerRepo;
	
	@PostMapping
	public Customer createCustomer(@RequestBody Customer customer ) {
		return customerRepo.save(customer);
	}
	
	@GetMapping
	public List<Customer> getAllCustomers(){
		return customerRepo.findAll();
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Void> deleteCustomer(@PathVariable String id) {
	    customerRepo.deleteById(id);
	    // Return a 204 No Content status for a successful deletion
	    return ResponseEntity.noContent().build();
	}
}
