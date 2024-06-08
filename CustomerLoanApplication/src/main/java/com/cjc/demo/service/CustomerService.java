package com.cjc.demo.service;

import org.springframework.web.multipart.MultipartFile;

import com.cjc.demo.model.AllPersonalDocument;
import com.cjc.demo.model.Customer_Details;

public interface CustomerService {

	void saveAllData(String customerdetails, String accountdetails, MultipartFile addressProof, MultipartFile panCard,
			MultipartFile incomeTax, MultipartFile addharCard, MultipartFile photo, MultipartFile signture,
			MultipartFile bankCheque, MultipartFile salarySlips, String customeraddress);

}