package com.cjc.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class FamilyDependentInfo {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int dependentInfoId;
	private int noOfFamilyMember;
	private int noOfChild;
	private String maritalStatus;
	private String dependentMember;
	private Double familyIncome;

}
