package com.nadia.spring.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        GreetingService greetingService = (GreetingService) context.getBean("greetingService");
        greetingService.getMessage();
    }
}
