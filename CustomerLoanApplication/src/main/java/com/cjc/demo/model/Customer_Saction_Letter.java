package com.cjc.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Customer_Saction_Letter {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int sanctionId;
	private String sanctionDate;
	private String applicantName;
	private Double contactDetails;
	private String producthomeEquity;
	private Double loanAmtSanctioned;
	private String interestType;
	private float rateOfInterest;
	private int loanTenureInYear;
	private Double monthlyEmiAmount;
	private String modeOfPayment;
	private String remarks;
	private String termsCondition;
	private String status;

}
