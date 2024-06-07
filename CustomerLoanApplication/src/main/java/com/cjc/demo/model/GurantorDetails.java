package com.cjc.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class GurantorDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int guarantorId;
	private String guarantorName;
	private String guarantorDateOfBirth;
	private String guarantorRelationshipWithCustomer;
	private long guarantorMobileNumber;
	private long guarantorAdharCardNo;
	private String guarantorMortgageDetails;
	private String guarantorJobDetails;
	private String guarantorLoaclAddress;
	private String guarantorPermanentAddress;

}
