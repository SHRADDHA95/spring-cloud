package com.accenture;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.sleuth.sampler.AlwaysSampler;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;


@SpringBootApplication
@EnableDiscoveryClient
public class MyConsumerSleuthZipkinApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyConsumerSleuthZipkinApplication.class, args);
	}

	@Bean
	public RestTemplate rt() {
		return new RestTemplate();
	}
	
	@Bean			//it will send all log message to zipkin for analysis
	public AlwaysSampler getSampler() {
		return new AlwaysSampler();
	}
	
}
