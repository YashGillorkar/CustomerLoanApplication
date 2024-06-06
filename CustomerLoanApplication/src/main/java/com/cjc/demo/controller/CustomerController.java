package com.cjc.demo.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.demo.dto.CustomerDto;
import com.cjc.demo.model.Customer_Details;
import com.cjc.demo.service.CustomerService;

@RestController
public class CustomerController {

	@Autowired
	CustomerService customerservice;

	@PostMapping("/postCustomer")
	public ResponseEntity<CustomerDto> postCustomer(@RequestBody Customer_Details customer)
	{
		customerservice.saveCustomerDetails(customer);
		CustomerDto response=new CustomerDto("Customer details saved",new Date());
		return new ResponseEntity<CustomerDto>(response,HttpStatus.CREATED);
	}
}
