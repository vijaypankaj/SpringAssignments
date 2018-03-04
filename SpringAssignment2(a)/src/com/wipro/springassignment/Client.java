package com.wipro.springassignment;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Client {

	public static void main(String[] args) {

		Resource resource=new ClassPathResource("applicationContext.xml");  
	    BeanFactory factory=new XmlBeanFactory(resource); 
		
	    // 1st instance of student class
	      Student s1=(Student)factory.getBean("st1");
	   s1.displayInfo();
	      
	   //2nd instance of student class
	    Student s2=(Student)factory.getBean("st2");
		s2.displayInfo();
		
		
	}

}
