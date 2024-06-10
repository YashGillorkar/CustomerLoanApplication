package com.cjc.demo.serviceImpl;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.multipart.MultipartFile;

import com.cjc.demo.model.AllPersonalDocument;
import com.cjc.demo.model.Customer_Cibil_Score;
import com.cjc.demo.model.Customer_Details;
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
}
