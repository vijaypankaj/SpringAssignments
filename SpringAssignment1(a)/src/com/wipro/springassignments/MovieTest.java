package com.wipro.springassignments;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class MovieTest {

	public static void main(String[] args) {
		
		Resource resource=new ClassPathResource("applicationContext.xml");  
	    BeanFactory factory=new XmlBeanFactory(resource);  
	      
	    Movie movie=(Movie)factory.getBean("moviebean");  
	    movie.displayInfo();  
		
		
		
		
	}

}
