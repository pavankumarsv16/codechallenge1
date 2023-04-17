package com.example.searchengine.searchengine;

import java.util.Arrays;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RestController;

import com.example.searchengine.searchengine.entity.Customer;
import com.example.searchengine.searchengine.repository.CustomerRepository;

@SpringBootApplication
@RestController
public class SearchengineApplication implements CommandLineRunner {

	@Autowired
	private CustomerRepository customerRepository;
	
	@Bean
	public ModelMapper modelMapper() {
		return new ModelMapper();
	}
	
	public static void main(String[] args) {
		SpringApplication.run(SearchengineApplication.class, args);
	}

	
	@Override
	public void run(String... args) throws Exception {
		Customer cust = Customer.builder().companyname("company").companyname2("company2").companyname3("company3")
				.countryref_appelation("IN").countryref_countrycode("IN").countryref_guid("123456789").createdbygid("Z0048RAF")
				.datasourceref_guid("123456").debitornumber("23456").deleted(false).dunsnumber("78945").guid("789456123").ifanumber("qwerty")
				.isicnumber("asdfg").location("Bengaluru").name1international("name1").name2international("name2").name3international("name3")
				.updatedbygid("Z003CZEA").build();
		
		Customer cust1 = Customer.builder().companyname("company").companyname2("company2").companyname3("company3")
				.countryref_appelation("IN").countryref_countrycode("IN").countryref_guid("123456789").createdbygid("Z004HXPT")
				.datasourceref_guid("123456").debitornumber("23456").deleted(false).dunsnumber("78945").guid("789456122").ifanumber("qwerty")
				.isicnumber("asdfg").location("Bengaluru").name1international("name1").name2international("name2").name3international("name3")
				.updatedbygid("Z003CZEA").build();
		
		customerRepository.saveAll(Arrays.asList(cust, cust1));
	}
}
