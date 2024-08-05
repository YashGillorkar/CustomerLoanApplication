package com.cjc.demo.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.cjc.demo.dto.ResponseDto;
import com.cjc.demo.model.CustomerVerification;
import com.cjc.demo.model.Customer_Saction_Letter;
import com.cjc.demo.service.CustomerService;

@CrossOrigin("*")
@RestController
public class CustomerController {

	@Autowired
	CustomerService customerservice;

	@PostMapping("insertAllData")
	public ResponseEntity<ResponseDto> PostData(@RequestPart("customerDetails") String customerdetails,
			@RequestPart(value ="addrprof"  )MultipartFile addressProof, @RequestPart(value ="pan") MultipartFile panCard,
			@RequestPart(value ="incometax") MultipartFile incomeTax, @RequestPart(value ="adhar") MultipartFile addharCard,
			@RequestPart(value="photo") MultipartFile photo, @RequestPart(value ="signature") MultipartFile signture,
			@RequestPart(value ="bankCheque") MultipartFile bankCheque, @RequestPart("slips") MultipartFile salarySlips) {
		customerservice.saveAllData(customerdetails, addressProof, panCard, incomeTax, addharCard, photo, signture,
				bankCheque, salarySlips);
		ResponseDto responseDto = new ResponseDto("The data has saved Successfully!", new Date());
		return new ResponseEntity<ResponseDto>(responseDto, HttpStatus.CREATED);
	}



	@PatchMapping("/customerVerification/{customerId}")
	public ResponseEntity<ResponseDto> customerVerification(@PathVariable int customerId,
			@RequestBody CustomerVerification cv) {

		customerservice.saveCustomerVerification(customerId, cv);

		ResponseDto resonseDto = new ResponseDto("the data has been updated to successfully!", new Date());
		return new ResponseEntity<ResponseDto>(resonseDto, HttpStatus.OK);
	}

	@PutMapping("/saveSactionDetails/{customerId}")
	public ResponseEntity<ResponseDto> saveSactionDetails(@PathVariable int customerId,
			@RequestBody Customer_Saction_Letter customerSactionLetter) {
		customerservice.saveSactionDetails(customerId, customerSactionLetter);
		ResponseDto responseDto = new ResponseDto("Data is Updated", new Date());
		return new ResponseEntity<ResponseDto>(responseDto, HttpStatus.CREATED);

	}
}
