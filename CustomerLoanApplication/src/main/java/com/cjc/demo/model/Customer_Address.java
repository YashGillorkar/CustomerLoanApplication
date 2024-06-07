package com.cjc.demo.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.Data;


@Data
@Entity
public class Customer_Address {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int customerAddressId;
	
	@OneToOne(cascade = CascadeType.ALL)
	private PermanentAddress permanentAddress;
	
	@OneToOne(cascade = CascadeType.ALL)
	private LocalAddress localAddress;

}
