package com.cjc.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Account_Details {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int accountId;
	private String accountType;
	private double accountBalance;
	private String accountStatus;
	private long accountNumber;
}
