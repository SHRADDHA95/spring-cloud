package com.accenture;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@Controller			//monolithic (spring mvc)
@RestController		//microservices (spring rest/spring boot)
public class ProducerController {
	
	org.apache.logging.log4j.Logger log = Logger.getLogger(ProducerController.class);
	
	@Value("${server.port}")
	String port;
	
	@RequestMapping("/welcomeproducer")
	public String producerWelcomeMethod() {
		log.debug("welcome method from producer called...");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return "this message is from producer running on port : " + port ;
	}
}
