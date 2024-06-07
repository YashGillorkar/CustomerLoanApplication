package com.cjc.demo.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.demo.repository.CustomerRepository;
import com.cjc.demo.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	CustomerRepository customerrepository;

	@Override
	public void saveData(String customerJson, String accountDetail) {

	}

}
