package com.cjc.demo.service;

import org.springframework.web.multipart.MultipartFile;


import com.cjc.demo.model.CustomerVerification;

import com.cjc.demo.model.Customer_Saction_Letter;

public interface CustomerService {

	void saveAllData(String customerdetails, MultipartFile addressProof, MultipartFile panCard,
			MultipartFile incomeTax, MultipartFile addharCard, MultipartFile photo, MultipartFile signture,
			MultipartFile bankCheque, MultipartFile salarySlips);


	void saveCustomerVerification(int customerId, CustomerVerification cv);

	void saveSactionDetails(int customerId, Customer_Saction_Letter customerSactionLetter);


}