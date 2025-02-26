package com.nadia.spring.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Employee employee1 = context.getBean("employee1" , Employee.class);
		employee1.displayEmployeeDetails();
		
		Employee employee2 = context.getBean("employee2" , Employee.class);
		employee2.displayEmployeeDetails();

	}
}