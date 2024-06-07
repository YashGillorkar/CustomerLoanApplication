package com.cjc.demo.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.cjc.demo.dto.CustomerDto;
import com.cjc.demo.model.AllPersonalDocument;
import com.cjc.demo.model.Customer_Details;
import com.cjc.demo.service.CustomerService;

@RestController
public class CustomerController {

	@Autowired
	CustomerService customerservice;

	

	
	@PostMapping("insertAllData")
	public ResponseEntity<CustomerDto> postAllData(@RequestPart("customerDetails") String customerdetails,
													@RequestPart("accountDetails") String accountdetails,
													@RequestPart("addrprof") MultipartFile addressProof,
													@RequestPart("pan") MultipartFile panCard, @RequestPart("incometax") MultipartFile incomeTax,
													@RequestPart("adhar") MultipartFile addharCard, @RequestPart("photo") MultipartFile photo,
													@RequestPart("signature") MultipartFile signture, @RequestPart("bankCheque") MultipartFile bankCheque,
													@RequestPart("slips") MultipartFile salarySlips,
													@RequestPart("addressdetails") String addressDetails)
	{
		customerservice.saveAllData(customerdetails,accountdetails,addressProof, panCard, incomeTax, addharCard, photo, signture, bankCheque,
				salarySlips,addressDetails);
			CustomerDto customerdto= new CustomerDto("The data has saved Successfully!", new Date());
			return new ResponseEntity<CustomerDto>(customerdto,HttpStatus.CREATED);										
	
		
	}

}
