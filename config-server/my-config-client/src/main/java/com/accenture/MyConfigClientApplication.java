package com.accenture;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class MyConfigClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyConfigClientApplication.class, args);
	}

}
