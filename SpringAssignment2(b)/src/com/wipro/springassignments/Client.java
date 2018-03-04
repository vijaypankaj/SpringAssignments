package com.wipro.springassignments;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Client {

	public static void main(String[] args) {

		Resource resource=new ClassPathResource("applicationContext.xml");  
	    BeanFactory factory=new XmlBeanFactory(resource); 
		
	    Player player1=(Player)factory.getBean("p1");
		player1.displayInfo();
		
		Player player2=(Player)factory.getBean("p2");
		player2.displayInfo();
		
		Player player3=(Player)factory.getBean("p3");
		player3.displayInfo();
		
		Player player4=(Player)factory.getBean("p4");
		player4.displayInfo();
		
		Player player5=(Player)factory.getBean("p5");
		player5.displayInfo();
		
		MappingClass mp=(MappingClass)factory.getBean("cp1");
		mp.displayPlayerNames();
		
	}

}
