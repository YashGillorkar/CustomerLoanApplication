package com.cjc.demo.dto;

import lombok.Data;

@Data
public class Enquiry {
	

	private String enquiry_Id;
	private String first_Name;
	private String middle_Name;
	private String last_Name;
	private String applicant_EmailId;
	private long contact_Number;
	private long alternateContactNumber;
	private int age;
	private String panCardNumber;

}
