package com.cjc.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
@EnableDiscoveryClient
@SpringBootApplication
public class CustomerDetailsApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomerDetailsApplication.class, args);
	}

}
