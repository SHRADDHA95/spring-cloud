package com.accenture;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.sleuth.sampler.AlwaysSampler;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableDiscoveryClient
public class MyProducerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyProducerApplication.class, args);
	}

	@Bean // it will send all log message to zipkin for analysis
	public AlwaysSampler getSampler() {
		return new AlwaysSampler();
	}
}
