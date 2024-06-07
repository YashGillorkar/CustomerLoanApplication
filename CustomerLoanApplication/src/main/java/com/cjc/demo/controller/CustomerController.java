package com.cjc.demo.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.demo.dto.ResponseDto;
import com.cjc.demo.service.CustomerService;

@RestController
public class CustomerController {

	@Autowired
	CustomerService customerservice;

	@PostMapping("/postCustomer")
	public ResponseEntity<ResponseDto> saveCustomerDataInDatabase(@RequestPart("info") String customerJson,
			@RequestPart("accountDetails") String accountDetail){
		customerservice.saveData(customerJson,accountDetail);
		ResponseDto response = new ResponseDto("Customer Data Added", new Date());
		return new ResponseEntity<ResponseDto>(response,HttpStatus.CREATED);
	}
}
