package com.cjc.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import lombok.Data;

@Data
@Entity
public class AllPersonalDocument {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int documentId;
	@Lob
	@Column(length = 999999999)
	private byte[] addressProof;
	@Lob
	@Column(length = 999999999)
	private byte[] panCard;
	@Lob
	@Column(length = 999999999)
	private byte[] incomeTax;
	@Lob
	@Column(length = 999999999)
	private byte[] addharCard;
	@Lob
	@Column(length = 999999999)
	private byte[] photo;
	@Lob
	@Column(length = 999999999)
	private byte[] signture;
	@Lob
	@Column(length = 999999999)
	private byte[] bankCheque;
	@Lob
	@Column(length = 999999999)
	private byte[] salarySlips;

	private byte addressProof;
	@Lob
	@Column(length = 999999999)
	private byte panCard;
	@Lob
	@Column(length = 999999999)
	private byte incomeTax;
	@Lob
	@Column(length = 999999999)
	private byte addharCard;
	@Lob
	@Column(length = 999999999)
	private byte photo;
	@Lob
	@Column(length = 999999999)
	private byte signture;
	@Lob
	@Column(length = 999999999)
	private byte bankCheque;
	@Lob
	@Column(length = 999999999)
	private byte salarySlips;

}
