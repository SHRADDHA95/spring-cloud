package com.accenture;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


@SpringBootApplication
@EnableDiscoveryClient
public class MyConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyConsumerApplication.class, args);
	}

	
}
