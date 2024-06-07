package com.cjc.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class PermanentAddress {

	@Id
	@GeneratedValue(strategy =GenerationType.AUTO)
	private int permanentAddressId;
	private String areaName;
	private String cityName;
	private String district;
	private String state;
	private Long pincode;
	private int houseNumber;
	private String streetName;
	
}
