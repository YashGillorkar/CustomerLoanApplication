package com.cjc.demo.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
<<<<<<< HEAD
import org.springframework.web.bind.annotation.PatchMapping;
=======
>>>>>>> branch 'master' of https://github.com/YashGillorkar/CustomerLoanApplication.git
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
<<<<<<< HEAD
=======
import org.springframework.web.bind.annotation.PutMapping;
>>>>>>> branch 'master' of https://github.com/YashGillorkar/CustomerLoanApplication.git
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.cjc.demo.dto.ResponseDto;
import com.cjc.demo.model.CustomerVerification;
<<<<<<< HEAD
=======
import com.cjc.demo.model.Customer_Saction_Letter;
>>>>>>> branch 'master' of https://github.com/YashGillorkar/CustomerLoanApplication.git
import com.cjc.demo.service.CustomerService;

@RestController
public class CustomerController {

	@Autowired
	CustomerService customerservice;

	@PostMapping("insertAllData")
	public ResponseEntity<ResponseDto> PostData(@RequestPart("customerDetails") String customerdetails,
			@RequestPart("addrprof") MultipartFile addressProof, @RequestPart("pan") MultipartFile panCard,
			@RequestPart("incometax") MultipartFile incomeTax, @RequestPart("adhar") MultipartFile addharCard,
			@RequestPart("photo") MultipartFile photo, @RequestPart("signature") MultipartFile signture,
			@RequestPart("bankCheque") MultipartFile bankCheque, @RequestPart("slips") MultipartFile salarySlips) {
		customerservice.saveAllData(customerdetails, addressProof, panCard, incomeTax, addharCard, photo, signture,
				bankCheque, salarySlips);
		ResponseDto responseDto = new ResponseDto("The data has saved Successfully!", new Date());
		return new ResponseEntity<ResponseDto>(responseDto, HttpStatus.CREATED);
	}
<<<<<<< HEAD

	@PatchMapping("/customerVerification/{customerId}")
	public ResponseEntity<ResponseDto> customerVerification(@PathVariable int customerId, 
			@RequestBody CustomerVerification cv) {
		
		customerservice.saveCustomerVerification(customerId, cv);

		ResponseDto resonseDto = new ResponseDto("the data has been updated to successfully!", new Date());
		return new ResponseEntity<ResponseDto>(resonseDto, HttpStatus.OK);
=======
	
	@PutMapping("/saveSactionDetails/{customerId}")
	public ResponseEntity<ResponseDto> saveSactionDetails(@PathVariable int customerId,@RequestBody Customer_Saction_Letter  customerSactionLetter){
		customerservice.saveSactionDetails(customerId,customerSactionLetter);
		ResponseDto responseDto = new ResponseDto("Data is Updated", new Date());
		return new ResponseEntity<ResponseDto>(responseDto, HttpStatus.CREATED);
		
>>>>>>> branch 'master' of https://github.com/YashGillorkar/CustomerLoanApplication.git
	}
}
