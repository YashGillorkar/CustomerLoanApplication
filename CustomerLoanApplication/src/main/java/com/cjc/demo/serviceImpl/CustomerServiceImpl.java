package com.cjc.demo.serviceImpl;

<<<<<<< HEAD
import java.io.IOException;
import java.util.regex.Pattern;

=======
>>>>>>> branch 'master' of https://github.com/YashGillorkar/CustomerLoanApplication.git
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

<<<<<<< HEAD
import com.cjc.demo.exception.InvaildAgeException;
import com.cjc.demo.exception.InvalidAlternateMobileNumberException;
import com.cjc.demo.exception.InvalidDateOfBirthException;
import com.cjc.demo.exception.InvalidFristNameException;
import com.cjc.demo.exception.InvalidLastNameException;
import com.cjc.demo.exception.InvalidMiddleNameException;
import com.cjc.demo.exception.InvalidMobileNumberException;
import com.cjc.demo.exxception.InvalidEmailIdException;
import com.cjc.demo.model.Account_Details;
import com.cjc.demo.model.AllPersonalDocument;
import com.cjc.demo.model.Customer_Address;
import com.cjc.demo.model.Customer_Details;
=======
>>>>>>> branch 'master' of https://github.com/YashGillorkar/CustomerLoanApplication.git
import com.cjc.demo.repository.CustomerRepository;
import com.cjc.demo.service.CustomerService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	CustomerRepository customerrepository;

	

	@Override
	public void saveAllData(String customerdetails, String accountdetails, MultipartFile addressProof,
			MultipartFile panCard, MultipartFile incomeTax, MultipartFile addharCard, MultipartFile photo,
			MultipartFile signture, MultipartFile bankCheque, MultipartFile salarySlips,String customeraddress) 
	{

		ObjectMapper objectmapper = new ObjectMapper();
		Customer_Details customerdetail = new Customer_Details();
		Account_Details accountDetail = null;
		Customer_Address customeraddres= new Customer_Address();
		AllPersonalDocument alldocument = new AllPersonalDocument();
		try {
			customerdetail = objectmapper.readValue(customerdetails, Customer_Details.class);
			accountDetail = objectmapper.readValue(accountdetails, Account_Details.class);
			customeraddres = objectmapper.readValue(customeraddress,Customer_Address.class );
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		try {
			alldocument.setAddressProof(addressProof.getBytes());
			alldocument.setPanCard(panCard.getBytes());
			alldocument.setIncomeTax(incomeTax.getBytes());
			alldocument.setAddharCard(addharCard.getBytes());
			alldocument.setPhoto(photo.getBytes());
			alldocument.setSignture(signture.getBytes());
			alldocument.setBankCheque(bankCheque.getBytes());
			alldocument.setSalarySlips(salarySlips.getBytes());

			customerdetail.setAccountDetails(accountDetail);
			customerdetail.setAllpersondoc(alldocument);
			
			customerdetail.getCustomeraddress().setPermanentAddress(customeraddres.getPermanentAddress());
			customerdetail.getCustomeraddress().setLocalAddress(customeraddres.getLocalAddress());
			
			customerrepository.save(customerdetail);

		} catch (IOException ie) {
			ie.printStackTrace();
		}

	}

	@Override
	public AllPersonalDocument saveAllDocuments(MultipartFile addressProof, MultipartFile panCard,
			MultipartFile incomeTax, MultipartFile addharCard, MultipartFile photo, MultipartFile signture,
			MultipartFile bankCheque, MultipartFile salarySlips) {
		// TODO Auto-generated method stub
		return null;
	}

}
