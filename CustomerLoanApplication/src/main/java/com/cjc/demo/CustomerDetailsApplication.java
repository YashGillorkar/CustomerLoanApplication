package com.cjc.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
@EnableDiscoveryClient
@SpringBootApplication
public class CustomerDetailsApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomerDetailsApplication.class, args);
	}
	
	@Bean
	public RestTemplate m1()
	{
		RestTemplate rt= new RestTemplate();
		return rt;
	}

}
