package com.bank.msperson;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class MsPersonApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsPersonApplication.class, args);
	}

}
