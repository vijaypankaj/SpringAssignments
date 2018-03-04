package com.wipro.springassignment;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Student {

	private String studentId;
	private String studentName;
	private Set<Test> studentTest;
	
	public String getStudentId() {
		return studentId;
	}
	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public Set<Test> getStudentTest() {
		return studentTest;
	}
	public void setStudentTest(Set<Test> studentTest) {
		this.studentTest = studentTest;
	}
	public void displayInfo(){
		
		System.out.println("Student Id:"+studentId);
		System.out.println("Student Name:"+studentName);
		System.out.println("Test details:");
		Set<Test> s=new HashSet<Test>();
		s.addAll(studentTest);
		Iterator itr=s.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		
	}
}
