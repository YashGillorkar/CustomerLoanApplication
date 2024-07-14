package com.cjc.swagger;

import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.servers.Server;

@Configuration
public class OpenAPIConfiguation {

    @Bean
    public OpenAPI defineOpenApi() {
        Server server = new Server();
        server.setUrl("http://localhost:8081"); // Adjust if needed
        server.setDescription("Development Environment");

        Contact myContact = new Contact();
        myContact.setName("Yash Gillorkar");
        myContact.setEmail("yashgillorkar04@gmail.com");

        Info information = new Info()
                .title("Customer Loan Management API")
                .version("1.0")
                .description("APIs for managing customer loan applications, including submission, updates, and inquiries.")
                .contact(myContact);
                
        return new OpenAPI().info(information).servers(List.of(server));
    }
}
