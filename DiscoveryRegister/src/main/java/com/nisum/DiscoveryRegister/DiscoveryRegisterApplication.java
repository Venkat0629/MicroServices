package com.nisum.DiscoveryRegister;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class DiscoveryRegisterApplication {

	public static void main(String[] args) {
		SpringApplication.run(DiscoveryRegisterApplication.class, args);
	}

}
