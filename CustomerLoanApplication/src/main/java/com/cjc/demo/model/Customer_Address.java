package com.cjc.demo.model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
public class Customer_Address {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int customerAddressId;
//private	 PermanentAddress permanentAddress;
//private LocalAddress localAddress;

}
