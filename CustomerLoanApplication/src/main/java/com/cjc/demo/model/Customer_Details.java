package com.cjc.demo.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.Data;

@Data
@Entity
public class Customer_Details {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int customerId;
	private String customer_First_Name;
	private String customer_Middle_Name;
	private String customer_Last_Name;
	private String customerDateOfBirth;
	private int age;
	private String gender;
	private String customerEmail;
	private long customer_Mobile_Number;
	private long customer_Additional_Mobile_Number;
	private double customerAmountPaidForCar;
	private double customerTotalLoanRequired;
	
	@Column(unique=true)
	private String customerPanCard;
	
	private String loanstatus;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Account_Details accountDetails;
	

	@OneToOne(cascade = CascadeType.ALL)
	private AllPersonalDocument allpersondoc;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Customer_Address customeraddress;


	@OneToOne(cascade = CascadeType.ALL)  
	private Customer_Cibil_Score customercibilscore;


//	@OneToMany(cascade = CascadeType.ALL)   
//	private CustomerLedger customerledger;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Customer_Medical_Info customermedicalinfo;


	@OneToOne(cascade = CascadeType.ALL)
	private Customer_Saction_Letter customersactionletter;
	

	@OneToOne(cascade = CascadeType.ALL)
	private CustomerVerification customerverification;
	

	@OneToOne(cascade = CascadeType.ALL)
	private FamilyDependentInfo familydependentinfo;	

	@OneToOne(cascade = CascadeType.ALL)
	private GurantorDetails gurantordetail;
	

	@OneToOne(cascade = CascadeType.ALL)
	private LoanDisbursement loanDisbursment;

}
