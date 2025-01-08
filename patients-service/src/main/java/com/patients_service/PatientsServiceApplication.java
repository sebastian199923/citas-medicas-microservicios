package com.patients_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class PatientsServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(PatientsServiceApplication.class, args);
	}

}
