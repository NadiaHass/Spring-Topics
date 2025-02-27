package com.nadia.spring.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationContextExample {
    public static void main(String[] args) {
    	
    	ApplicationContext context;

    	// XML Configuration
    	context = new ClassPathXmlApplicationContext("applicationContext.xml");
    	GreetingService greetingServiceXml = context.getBean("greetingService", GreetingService.class);
    	greetingServiceXml.getMessage();

    	// Java Configuration
    	context = new AnnotationConfigApplicationContext(AppConfig.class);
    	GreetingService greetingServiceJava = context.getBean("greetingService", GreetingService.class);
    	greetingServiceJava.getMessage();

    }
}