package com.cjc.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class AllPersonalDocument {

	@Id
	private int documentId;
	private byte addressProof;
	private byte panCard;
	private byte incomeTax;
	private byte addharCard;
	private byte photo;
	private byte signture;
	private byte bankCheque;
	private byte salarySlips;
	
}
