package com.cjc.demo.serviceImpl;

import java.util.regex.Pattern;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.demo.exception.InvaildAgeException;
import com.cjc.demo.exception.InvalidAlternateMobileNumberException;
import com.cjc.demo.exception.InvalidDateOfBirthException;
import com.cjc.demo.exception.InvalidFristNameException;
import com.cjc.demo.exception.InvalidLastNameException;
import com.cjc.demo.exception.InvalidMiddleNameException;
import com.cjc.demo.exception.InvalidMobileNumberException;
import com.cjc.demo.exxception.InvalidEmailIdException;
import com.cjc.demo.model.Customer_Details;
import com.cjc.demo.repository.CustomerRepository;
import com.cjc.demo.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	CustomerRepository customerrepository;

	private static final String MOBILE_PATTERN = "[7-9][0-9]{9}";
	Pattern datePattern = Pattern.compile("\\d{4}-\\d{2}-\\d{2}");

	@Override
	public void saveCustomerDetails(Customer_Details customer) {

		if (!customer.getCustomer_First_Name().matches("[a-zA-Z]+")) {
			throw new InvalidFristNameException("Frist Name should not contain number or special symol or space");
		}
		if (!customer.getCustomer_Middle_Name().matches("[a-zA-Z]+")) {
			throw new InvalidMiddleNameException("Middle Name should not contain number or special symol or space");
		}
		if (!customer.getCustomer_Last_Name().matches("[a-zA-Z]+")) {
			throw new InvalidLastNameException("Last Name should not contain number or special symol or space");
		}
		if (!(customer.getCustomerEmail().endsWith("@gmail.com"))) {
			throw new InvalidEmailIdException("Email id should not contain space and should ends with @gmail.com");
		}
		String mobileNumberStr = Long.toString(customer.getCustomer_Mobile_Number());
		if (!Pattern.matches(MOBILE_PATTERN, mobileNumberStr)) {
			throw new InvalidMobileNumberException("Please Enter a valid mobile number");
		}

		String AlternatemobileNumberStr = Long.toString(customer.getCustomer_Additional_Mobile_Number());
		if (!Pattern.matches(MOBILE_PATTERN, AlternatemobileNumberStr)) {
			throw new InvalidAlternateMobileNumberException("Please Enter a valid mobile number");
		}
		int age = customer.getAge();
		if (!(age >= 21 && age <= 75)) {
			throw new InvaildAgeException("Age should be between 21 and 75");
		}

		if (customer.getGender().charAt(0) == 'M' || customer.getGender().charAt(0) == 'm') {
			customer.setGender("Male");
		} else if (customer.getGender().charAt(0) == 'F' || customer.getGender().charAt(0) == 'f') {
			customer.setGender("Female");
		} else {
			customer.setGender("Other");
		}
		if (!datePattern.matcher(customer.getCustomerDateOfBirth()).matches()) {
			throw new InvalidDateOfBirthException("Please Enter a Valid Date Of Birth");
		}

		customerrepository.save(customer);
	}

}
