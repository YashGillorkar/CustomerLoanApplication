package com.cjc.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Customer_Verification {
	@Id
	private int verificationID;
	private String verificationDate;
	private String status;
	private String remarks;

}
