package com.accenture;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients // if we have declare feign interface then provide implementation for that at
					// run time
public class MyConsumerFeignApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyConsumerFeignApplication.class, args);
	}

}
