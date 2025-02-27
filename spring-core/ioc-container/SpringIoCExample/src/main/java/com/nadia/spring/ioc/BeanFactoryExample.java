package com.nadia.spring.ioc;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class BeanFactoryExample {

	public static void main(String[] args) {
		// deprecated 
		// Resource resource = new ClassPathResource("applicationContext.xml");
        // BeanFactory factory = new XmlBeanFactory(resource);
		
		
        Resource resource = new ClassPathResource("applicationContext.xml");
        DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
        XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
        reader.loadBeanDefinitions(resource);

        GreetingService greetingService = factory.getBean("greetingService", GreetingService.class);    
        greetingService.getMessage(); 
	}

}
