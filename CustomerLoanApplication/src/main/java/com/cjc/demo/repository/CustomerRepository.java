package com.cjc.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cjc.demo.model.Customer_Details;

public interface CustomerRepository extends JpaRepository<Customer_Details, Integer>{

}
