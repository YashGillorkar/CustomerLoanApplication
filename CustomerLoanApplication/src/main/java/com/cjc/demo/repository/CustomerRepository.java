package com.cjc.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cjc.demo.model.Customer_Details;

@Repository
public interface CustomerRepository extends JpaRepository<Customer_Details, Integer>{

}
