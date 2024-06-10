package com.cjc.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class LoanDisbursement {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "agreement_id")
    private int agreementId;

    @Column(name = "loan_no")
    private int loanNo;

    @Column(name = "agreement_date")
    private int agreementDate;

    @Column(name = "amount_pay_type")
    private String amountPayType;

    @Column(name = "total_amount")
    private Double totalAmount;

    @Column(name = "bank_name")
    private String bankName;

    @Column(name = "account_number")
    private Long accountNumber;

    @Column(name = "ifsc_code")
    private String IFSCCode;

    @Column(name = "account_type")
    private String accountType;

    @Column(name = "transfer_amount")
    private Double transferAmount;

    @Column(name = "payment_status")
    private String paymentStatus;

    @Column(name = "amount_paid_date")
    private String amountPaidDate;
}
