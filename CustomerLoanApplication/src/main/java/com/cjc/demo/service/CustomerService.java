package com.cjc.demo.service;

<<<<<<< HEAD


import org.springframework.web.multipart.MultipartFile;

import com.cjc.demo.model.AllPersonalDocument;
import com.cjc.demo.model.Customer_Details;

public interface CustomerService 
{
=======
public interface CustomerService {
>>>>>>> branch 'master' of https://github.com/YashGillorkar/CustomerLoanApplication.git

	void saveData(String customerJson, String accountDetail);

	AllPersonalDocument saveAllDocuments(MultipartFile addressProof, MultipartFile panCard, MultipartFile incomeTax,
			MultipartFile addharCard, MultipartFile photo, MultipartFile signture, MultipartFile bankCheque,
			MultipartFile salarySlips);


	void saveAllData(String customerdetails, String accountdetails, MultipartFile addressProof, MultipartFile panCard,
			MultipartFile incomeTax, MultipartFile addharCard, MultipartFile photo, MultipartFile signture,
			MultipartFile bankCheque, MultipartFile salarySlips, String customeraddress);

}
