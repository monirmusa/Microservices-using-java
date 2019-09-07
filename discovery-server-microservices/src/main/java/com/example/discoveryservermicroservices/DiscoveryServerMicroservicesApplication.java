package com.example.discoveryservermicroservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class DiscoveryServerMicroservicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(DiscoveryServerMicroservicesApplication.class, args);
	}

}
