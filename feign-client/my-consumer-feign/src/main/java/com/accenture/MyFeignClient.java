package com.accenture;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name = "producer-feign", decode404 = true)
public interface MyFeignClient {
	// no need to provide implementation of this interface, it will be provided by
	// framework at runtime
	@RequestMapping("/welcomeproducer")
	String getMessageFromProduer();
}
