package com.accenture;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@Controller			//monolithic (spring mvc)
@RestController		//microservices (spring rest/spring boot)
public class ProducerController {
	
	@Value("${server.port}")
	String port;
	
	@RequestMapping("/welcomeproducer")
	public String producerWelcomeMethod() {
		System.out.println(10/0);
		return "this message is from producer running on port : " + port ;
	}
}
