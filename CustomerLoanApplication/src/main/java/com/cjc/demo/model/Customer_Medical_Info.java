package com.cjc.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Customer_Medical_Info {
	@Id
	private int billId;
	private int patientId;
	private String professionsalpatientName;
	private String billingDate;
	private Double loanAmount;
	private String treatment;

}
