package com.example.actions;

import com.example.model.Student;
import com.opensymphony.xwork2.ActionSupport;

public class StudentAction extends ActionSupport{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
 Student student;

public Student getStudent() {
	return student;
}

public void setStudent(Student student) {
	this.student = student;
}



@Override
public String execute() throws Exception {
	//similar to calling service layer
	if(student.getPassword().equals("Sadik"))
	return SUCCESS;
	return ERROR;
}
}
