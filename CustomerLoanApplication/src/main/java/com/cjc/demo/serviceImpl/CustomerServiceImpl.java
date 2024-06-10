package com.cjc.demo.serviceImpl;

import java.io.IOException;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.multipart.MultipartFile;

<<<<<<< HEAD
import com.cjc.demo.exception.IdNotFoundException;
=======
import com.cjc.demo.exception.InvaliedCustomerId;
>>>>>>> branch 'master' of https://github.com/YashGillorkar/CustomerLoanApplication.git
import com.cjc.demo.model.AllPersonalDocument;
import com.cjc.demo.model.CustomerVerification;
import com.cjc.demo.model.Customer_Cibil_Score;
import com.cjc.demo.model.Customer_Details;
import com.cjc.demo.model.Customer_Saction_Letter;
import com.cjc.demo.repository.CustomerRepository;
import com.cjc.demo.service.CustomerService;
import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	CustomerRepository customerrepository;

	@Autowired
	RestTemplate rs;

	@Override
	public void saveAllData(String customerdetails, MultipartFile addressProof, MultipartFile panCard,
			MultipartFile incomeTax, MultipartFile addharCard, MultipartFile photo, MultipartFile signture,
			MultipartFile bankCheque, MultipartFile salarySlips) {

		try {
			ObjectMapper mapper = new ObjectMapper();
			Customer_Details ca = mapper.readValue(customerdetails, Customer_Details.class);

//			AllPersonalDocument ad = new AllPersonalDocument();
//			ca.setAllpersondoc(ad);

			if (ca.getAllpersondoc() == null) {
				ca.setAllpersondoc(new AllPersonalDocument());
			}
			AllPersonalDocument alldocument = ca.getAllpersondoc();

			alldocument.setAddressProof(addressProof.getBytes());
			alldocument.setPanCard(panCard.getBytes());
			alldocument.setIncomeTax(incomeTax.getBytes());
			alldocument.setAddharCard(addharCard.getBytes());
			alldocument.setPhoto(photo.getBytes());
			alldocument.setSignture(signture.getBytes());
			alldocument.setBankCheque(bankCheque.getBytes());
			alldocument.setSalarySlips(salarySlips.getBytes());

			String url = "http://localhost:1111/getCibilByPAN/" + ca.getCustomerPanCard();
			Customer_Cibil_Score cibilDetails = rs.getForObject(url, Customer_Cibil_Score.class);

			ca.setCustomercibilscore(cibilDetails);
			customerrepository.save(ca);

		} catch (IOException ie) {
			ie.printStackTrace();
		}
	}

	@Override
<<<<<<< HEAD
	public void saveCustomerVerification(int customerId, CustomerVerification cv) {

		Optional<Customer_Details> byId = customerrepository.findById(customerId);

		if (byId.isPresent()) {

			Customer_Details customer_Details = byId.get();

			CustomerVerification customerVerification = customer_Details.getCustomerverification();
			customer_Details.setCustomerverification(customerVerification);

			customerrepository.save(customer_Details);

			System.out.println("Customer ID: " + customerId + " verification details saved/updated successfully.");
		} else {

			throw new IdNotFoundException("ID is not present: " + customerId);
		}
	}

=======
	public void saveSactionDetails(int customerId, Customer_Saction_Letter customerSactionLetter) {
	
		Optional<Customer_Details> op=customerrepository.findById(customerId);
		if(op.isPresent()) {
			Customer_Details customer_Details = op.get();
			customer_Details.setCustomersactionletter(customerSactionLetter);
			customerrepository.save(customer_Details);
		}
		else {
			throw new InvaliedCustomerId("invaild customer id");
		}
	}
>>>>>>> branch 'master' of https://github.com/YashGillorkar/CustomerLoanApplication.git
}
