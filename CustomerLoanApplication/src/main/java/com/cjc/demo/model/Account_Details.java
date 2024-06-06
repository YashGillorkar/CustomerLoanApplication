package com.cjc.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Account_Details {

	@Id
	private int accountId;
	private String accountType;
	private double accountBalance;
	private String accountStatus;
	private long accountNumber;
}
