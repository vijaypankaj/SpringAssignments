package com.wipro.springassignments.SpringAssignment4;

import java.util.ArrayList;
import java.util.List;

import org.springframework.orm.hibernate3.HibernateTemplate;

public class StudentDao {

	HibernateTemplate template;

	public void setTemplate(HibernateTemplate template) {
		this.template = template;
	}
	
	//method to save student details
	public void saveStudentDetails(Student s){
		
		template.save(s);
		
	}
	//method to update student  
	public void updateStudentDetails(Student s){  
	    template.update(s);  
	}  
	//method to delete student  
	public void deleteStudent(Student s){  
	    template.delete(s);  
	}  
	//method to return one students of given id  
	public Student getById(int studentId){  
		Student s=(Student)template.get(Student.class,studentId);  
	    return s;  
	}  
	//method to return all students  
	public List<Student> getEmployees(){  
	    List<Student> list=new ArrayList<Student>();  
	    list=template.loadAll(Student.class);  
	    return list;  
	} 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
