package com.accenture;

import org.springframework.stereotype.Component;

import feign.Response;
import feign.codec.ErrorDecoder;

@Component
public class MyFeignDecoder implements ErrorDecoder{
	@Override
	public Exception decode(String methodKey, Response response) {
		if(response.status() == 500) {
			return new RuntimeException("there was some problem from produer...");
		}
		if(response.status() == 404) {
			return new RuntimeException("given resource not present in producer");
		}
		return null;
	}
}
