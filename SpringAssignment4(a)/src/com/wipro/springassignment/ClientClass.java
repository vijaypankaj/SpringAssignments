package com.wipro.springassignment;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClientClass {

	public static void main(String[] args) {

		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");  
	      
	    StudentDao dao=(StudentDao)ctx.getBean("stdao");  
	    /*int status=dao.saveStudent(new Student("S101","Pankaj Vijay","23/8 Shanti Nagar New Delhi"));  
	    System.out.println(status); */
		
	    int updateStatus=dao.updateStudent(new Student("S101","Rohit Sharma","23/9 Shanti Nagar, New Delhi"));
	    System.out.println(updateStatus);
	    
	    /*int result=dao.deleteStudent(new Student("S101","Pankaj Vijay","23/8 Shanti Nagar New Delhi"));
	    System.out.println(result);*/
	}
}