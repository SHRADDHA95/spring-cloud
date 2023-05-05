package com.accenture;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyConsumerController {
	
	@Autowired
	MyFeignClient mfc;
	
	@RequestMapping("/accessmessage")
	public String returnMessageToUser() {
		return mfc.getMessageFromProduer();
	}
	
	@ExceptionHandler(RuntimeException.class)
	public String handleException(RuntimeException re) {
		return re.getMessage();
	}
	
}
