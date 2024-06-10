package com.cjc.demo.service;

import org.springframework.web.multipart.MultipartFile;

<<<<<<< HEAD
import com.cjc.demo.model.CustomerVerification;
=======
import com.cjc.demo.model.Customer_Saction_Letter;
>>>>>>> branch 'master' of https://github.com/YashGillorkar/CustomerLoanApplication.git

public interface CustomerService {

	void saveAllData(String customerdetails, MultipartFile addressProof, MultipartFile panCard,
			MultipartFile incomeTax, MultipartFile addharCard, MultipartFile photo, MultipartFile signture,
			MultipartFile bankCheque, MultipartFile salarySlips);

<<<<<<< HEAD
	void saveCustomerVerification(int customerId, CustomerVerification cv);
=======
	void saveSactionDetails(int customerId, Customer_Saction_Letter customerSactionLetter);
>>>>>>> branch 'master' of https://github.com/YashGillorkar/CustomerLoanApplication.git

}