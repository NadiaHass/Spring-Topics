package com.nadia.spring.di;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


// This is equivalent to a spring XML configuration file
@Configuration
@ComponentScan("com.nadia.spring.di")
public class Config {
	
//	and we keep this empty, if we used the @componenet and @authowired
	@Bean
    public Address address() {
        return new Address("Montreuil", "Paris", "France");
    }
	
	 @Bean
	    public Employee employee(Address address) {
	        return new Employee(21, "Nadia", address);
	    }
}
