package com.accenture;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class MyConsumerController {
	
	@Autowired
	LoadBalancerClient lb;	//it can talk to other microservices by taking help of eureka
	
//	@RequestMapping(value = "/accessmessage")
//	public String returnMessage() {
//		RestTemplate rt = new RestTemplate();
//		String msg = rt.getForObject("http://localhost:8081/welcomeproducer", String.class);	//tightly coupled
//		return msg;
//	}
	
	@RequestMapping(value = "/accessmessage")
	public String returnMessage() {
		
		//i will get ip and port number using eureka with the help of LoadBalancerClient
		String producerDetails = lb.choose("producer").getUri().toString();				//loosely coupled
		
		RestTemplate rt = new RestTemplate();
		String msg = rt.getForObject(producerDetails+"/welcomeproducer", String.class);
		return msg;
	}
}
