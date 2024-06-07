package com.cjc.demo.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
<<<<<<< HEAD
import org.springframework.web.bind.annotation.RequestBody;
=======
>>>>>>> branch 'master' of https://github.com/YashGillorkar/CustomerLoanApplication.git
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

<<<<<<< HEAD
import com.cjc.demo.dto.CustomerDto;
import com.cjc.demo.model.AllPersonalDocument;
import com.cjc.demo.model.Customer_Details;
=======
import com.cjc.demo.dto.ResponseDto;
>>>>>>> branch 'master' of https://github.com/YashGillorkar/CustomerLoanApplication.git
import com.cjc.demo.service.CustomerService;

@RestController
public class CustomerController {

	@Autowired
	CustomerService customerservice;

<<<<<<< HEAD
	

	
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
	
		
=======
	@PostMapping("/postCustomer")
	public ResponseEntity<ResponseDto> saveCustomerDataInDatabase(@RequestPart("info") String customerJson,
			@RequestPart("accountDetails") String accountDetail){
		customerservice.saveData(customerJson,accountDetail);
		ResponseDto response = new ResponseDto("Customer Data Added", new Date());
		return new ResponseEntity<ResponseDto>(response,HttpStatus.CREATED);
>>>>>>> branch 'master' of https://github.com/YashGillorkar/CustomerLoanApplication.git
	}

}
