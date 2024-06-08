package com.cjc.demo.serviceImpl;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.multipart.MultipartFile;

import com.cjc.demo.dto.Enquiry;
import com.cjc.demo.model.Account_Details;
import com.cjc.demo.model.AllPersonalDocument;
import com.cjc.demo.model.Customer_Address;
import com.cjc.demo.model.Customer_Details;
import com.cjc.demo.repository.CustomerRepository;
import com.cjc.demo.service.CustomerService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    CustomerRepository customerrepository;
    
    @Autowired
    RestTemplate rs;

    @Override
    public void saveAllData(String customerdetails, String accountdetails, MultipartFile addressProof,
            MultipartFile panCard, MultipartFile incomeTax, MultipartFile addharCard, MultipartFile photo,
            MultipartFile signture, MultipartFile bankCheque, MultipartFile salarySlips, String customeraddress) {

        ObjectMapper objectmapper = new ObjectMapper();
        Customer_Details customerdetail = null;
        Account_Details accountDetail = null;
        Customer_Address customeraddres = null;
        AllPersonalDocument alldocument = new AllPersonalDocument();
        try {
            customerdetail = objectmapper.readValue(customerdetails, Customer_Details.class);
            accountDetail = objectmapper.readValue(accountdetails, Account_Details.class);
            customeraddres = objectmapper.readValue(customeraddress, Customer_Address.class);
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

            if (customerdetail.getCustomeraddress() == null) {
                customerdetail.setCustomeraddress(new Customer_Address());
            }
            customerdetail.setAccountDetails(accountDetail);
            customerdetail.setAllpersondoc(alldocument);

            customerdetail.getCustomeraddress().setPermanentAddress(customeraddres.getPermanentAddress());
            customerdetail.getCustomeraddress().setLocalAddress(customeraddres.getLocalAddress());
            
            String url = "http://laptop-h0s4ng2g:1111/getAllData";
            List<Enquiry> eq = (List<Enquiry>) rs.getForObject(url, Enquiry.class);
            
            customerrepository.save(customerdetail);

        } catch (IOException ie) {
            ie.printStackTrace();
        }

    }

}
