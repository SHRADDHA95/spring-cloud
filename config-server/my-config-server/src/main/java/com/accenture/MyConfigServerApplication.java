package com.accenture;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableDiscoveryClient		//register this application with eureka
@EnableConfigServer			//convert this application into config server
public class MyConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyConfigServerApplication.class, args);
	}

}
