package com.example.searchengine.searchengine.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.searchengine.searchengine.entity.Customer;
import com.example.searchengine.searchengine.repository.CustomerRepository;

@RestController
@RequestMapping(path = "/customers")
public class CustomerController {

	
	@Autowired
	private CustomerRepository repo;
	
	@GetMapping
	public List<Customer> getAllCustomers() {
		return repo.search("12");
	}
}
