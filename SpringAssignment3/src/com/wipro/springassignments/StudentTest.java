package com.wipro.springassignments;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentTest {

	public static void main(String[] args) {
		
		
		
		ApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext.xml");

		Student stud = (Student) appContext.getBean("studentProxy");

		System.out.println("*************************************************************");
stud.getAllDetails();
		System.out.println("------------x--------------x------------x---------------x-------------");
stud.getDetails("S001");
		System.out.println("*************************************************************");
	}
}
