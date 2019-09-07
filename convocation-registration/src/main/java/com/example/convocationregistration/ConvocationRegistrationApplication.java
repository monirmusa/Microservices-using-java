package com.example.convocationregistration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class ConvocationRegistrationApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConvocationRegistrationApplication.class, args);
	}

}
