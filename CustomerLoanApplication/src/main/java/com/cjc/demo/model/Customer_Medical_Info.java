package com.cjc.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Customer_Medical_Info {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int billId;
	private int patientId;
	private String professionsalpatientName;
	private String billingDate;
	private Double loanAmount;
	private String treatment;

}
