package com.cjc.demo.model;

<<<<<<< HEAD
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
=======
>>>>>>> branch 'master' of https://github.com/YashGillorkar/CustomerLoanApplication.git
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
