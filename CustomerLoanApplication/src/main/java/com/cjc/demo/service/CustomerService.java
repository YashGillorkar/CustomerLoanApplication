package com.cjc.demo.service;

import org.springframework.web.multipart.MultipartFile;

import com.cjc.demo.model.CustomerVerification;

public interface CustomerService {

	void saveAllData(String customerdetails, MultipartFile addressProof, MultipartFile panCard,
			MultipartFile incomeTax, MultipartFile addharCard, MultipartFile photo, MultipartFile signture,
			MultipartFile bankCheque, MultipartFile salarySlips);

	void saveCustomerVerification(int customerId, CustomerVerification cv);

}