package com.example.searchengine.searchengine.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.searchengine.searchengine.entity.Customer;
import com.example.searchengine.searchengine.repository.CustomerRepository;

@Service
public class CustomerService {

	@Autowired
	private CustomerRepository repo;
	
	public List<Customer> listAll(String keyword) {
		if (keyword != null) {
            return repo.search(keyword);
        }
        return repo.findAll();
	}
}
