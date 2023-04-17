package com.example.searchengine.searchengine.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.searchengine.searchengine.entity.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long>{

	@Query("SELECT c FROM Customer c WHERE c.guid LIKE %?1%"
            + " OR c.dunsnumber LIKE %?1%"
            + " OR c.ifanumber LIKE %?1%"
            + " OR c.companyname LIKE %?1%"
            + " OR c.companyname2 LIKE %?1%"
            + " OR c.companyname3 LIKE %?1%"
            + " OR c.createdbygid LIKE %?1%"
            + " OR c.debitornumber LIKE %?1%"
            + " OR c.isicnumber LIKE %?1%"
            + " OR c.location LIKE %?1%"
            + " OR c.name1international LIKE %?1%"
            + " OR c.name2international LIKE %?1%"
            + " OR c.name3international LIKE %?1%"
            + " OR c.updatedbygid LIKE %?1%"
            + " OR c.countryref_appelation LIKE %?1%"
            + " OR c.countryref_countrycode LIKE %?1%"
            + " OR c.countryref_guid LIKE %?1%"
            + " OR c.datasourceref_guid LIKE %?1%")
    public List<Customer> search(String keyword);
	
}