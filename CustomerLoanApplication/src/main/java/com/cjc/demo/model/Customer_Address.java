package com.cjc.demo.model;

import jakarta.persistence.Id;
import lombok.Data;

@Data
public class Customer_Address {
	@Id
	private int customerAddressId;
//private	 PermanentAddress permanentAddress;
//private LocalAddress localAddress;

}
