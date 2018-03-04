package com.wipro.springassignment;

import org.springframework.jdbc.core.JdbcTemplate;

public class StudentDao {

	private JdbcTemplate jdbcTemplate;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	public int saveStudent(Student st){  
	    String query="insert into student values('"+st.getStudentId()+"','"+st.getStudentName()+"','"+st.getStudentAddress()+"')";  
	    return jdbcTemplate.update(query);  
	}  
	public int updateStudent(Student st){  
	    String query="update student set studentname='"+st.getStudentName()+"',studentaddress='"+st.getStudentAddress()+"' where studentid='"+st.getStudentId()+"'";  
	    return jdbcTemplate.update(query);  
	}  
	public int deleteStudent(Student st){  
	    String query="delete from student where studentid='"+st.getStudentId()+"'";  
	    return jdbcTemplate.update(query);  
	}  
	
	
}
