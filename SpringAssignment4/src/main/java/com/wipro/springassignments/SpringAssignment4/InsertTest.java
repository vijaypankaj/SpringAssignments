package com.wipro.springassignments.SpringAssignment4;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class InsertTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Resource r=new ClassPathResource("applicationContext.xml");  
	    BeanFactory factory=new XmlBeanFactory(r);  
	      
	    StudentDao dao=(StudentDao)factory.getBean("d");  
	      
	    Student st1=new Student("S001","Sobhan sharma","1256 shanti niketan orissa");  
	    dao.saveStudentDetails(st1);  
		
		
		
		
	}

}
