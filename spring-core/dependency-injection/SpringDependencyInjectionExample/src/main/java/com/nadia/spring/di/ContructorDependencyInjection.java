package com.nadia.spring.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ContructorDependencyInjection {
	public static void main(String[] args) {
		ApplicationContext contextXml = new ClassPathXmlApplicationContext("applicationContext.xml");
		
//		Using XML-based Configuration
		Employee employee1 = contextXml.getBean("employee1" , Employee.class);
		employee1.displayEmployeeDetails();
		
		Employee employee2 = contextXml.getBean("employee2" , Employee.class);
		employee2.displayEmployeeDetails();
		
		Employee employee3 = contextXml.getBean("employee3" , Employee.class);
		employee3.displayEmployeeDetails();

		
//		Using Java-based Configuration
        ApplicationContext contextJava = new AnnotationConfigApplicationContext(Config.class);

        Employee employee = contextJava.getBean(Employee.class);
        employee.displayEmployeeDetails();

		
	}
}