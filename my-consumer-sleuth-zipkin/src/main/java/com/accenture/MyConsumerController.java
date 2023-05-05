package com.accenture;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.netflix.discovery.converters.Auto;

@RestController
public class MyConsumerController {
	
	@Autowired
	RestTemplate rt;
	
	Logger log = Logger.getLogger(MyConsumerController.class);
	
	@RequestMapping("/accessmessage")
	public String returnMessageToUser() {
		log.debug("calling consumer method...");
		String msg = rt.getForObject("http://localhost:8081/welcomeproducer", String.class);
		return msg;
	}		
}
