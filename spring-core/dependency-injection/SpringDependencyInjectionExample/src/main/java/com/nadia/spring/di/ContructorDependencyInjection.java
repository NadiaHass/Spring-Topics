package com.nadia.spring.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ContructorDependencyInjection {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
//		Using xml configuration
		Employee employee1 = context.getBean("employee1" , Employee.class);
		employee1.displayEmployeeDetails();
		
		Employee employee2 = context.getBean("employee2" , Employee.class);
		employee2.displayEmployeeDetails();
		
		Employee employee3 = context.getBean("employee3" , Employee.class);
		employee3.displayEmployeeDetails();

//		using 
	}
}