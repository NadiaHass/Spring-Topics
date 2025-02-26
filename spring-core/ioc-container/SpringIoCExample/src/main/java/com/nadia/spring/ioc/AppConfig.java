package com.nadia.spring.ioc;

import org.springframework.context.annotation.Bean;

public class AppConfig {
	@Bean
	public GreetingService greetingService() {
		GreetingService greetingService = new GreetingService();
		greetingService.setMessage("Hello message from JAVA configuration !");
		return greetingService;
	}
}
