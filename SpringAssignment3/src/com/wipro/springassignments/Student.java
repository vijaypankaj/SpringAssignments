package com.wipro.springassignments;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Student {

	private String studentId;
	private String studentName;
	private String studentAddress;
	private Map<String,Student> result;
	
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName="
				+ studentName + ", studentAddress=" + studentAddress + "]";
	}
	public Student() {
		super();
	}
	public Student(String studentId, String studentName,
			String studentAddress) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentAddress = studentAddress;
	}
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
	public String getStudentAddress() {
		return studentAddress;
	}
	public void setStudentAddress(String studentAddress) {
		this.studentAddress = studentAddress;
	}
	
	public void getAllDetails(){
		
		List<Student> listOfStudents=new ArrayList<Student>();
	    
		for (int i = 1; i <=100; i++) {
		
			listOfStudents.add(new Student("S00"+i,"Student"+i,"15/"+i+"Vaishali Nagar"));
			}
		
		result =
			    listOfStudents.stream().collect(Collectors.toMap(Student::getStudentId, c -> c));
		System.out.println("StudentDetails:");
		
		for(String key:result.keySet()){
			
			
			Student st=result.get(key);
			
			System.out.println(st);
			
			
		}
	}
	
	public void getDetails(String studentId){
		
	System.out.println(result.get(studentId));
	}
}
