package com.accenture;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class ConfigClientController {
	
	@Value("${myorg:test}")
	private String mo;
	
	@RequestMapping("/getconfig")
	public String getConfig() {
		return mo;
	}
}
