package com.example.searchengine.searchengine.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Customer {

	@Id
	private String guid;
	
	private String dunsnumber;

	private String ifanumber;

	private String companyname;

	private String companyname2;
	private String companyname3;
	private String createdbygid;
	private Date createdtime;
	private String debitornumber;
	private boolean deleted;
	private String isicnumber;
	private String location;
	private String name1international;
	private String name2international;
	private String name3international;
	private String updatedbygid;
	private Date updatedtime;
	private Integer version;
	private String countryref_appelation;
	private String countryref_countrycode;
	private String countryref_guid;
	private String datasourceref_guid;

}
