package com.cjc.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Customer_Cibil_Score {
	
	@Id
	private String cibil_Id;
	private int cibil_score;
	private String remark;
	private boolean isApplicable;

}
