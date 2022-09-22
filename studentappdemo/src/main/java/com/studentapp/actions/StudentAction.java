package com.studentapp.actions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;
import org.apache.log4j.Logger;


import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.util.ValueStack;
import com.studentapp.model.Student;

public class StudentAction extends ActionSupport implements SessionAware{
	/**
	 * 
	 */
	
	private static final long serialVersionUID = 1L;
	private List<String> hobbies;
	Map<String, Object> appSession;
    Logger logger=Logger.getLogger(StudentAction.class);

	public List<String> getHobbies() {
		return hobbies;
	}
	@Override
	public void setSession(Map<String, Object> session) {
		//a sesion ref is initialized, now values can be set in session
		appSession=session;
		
	}
	public void setHobbies(List<String> hobbies) {
		this.hobbies = hobbies;
	}

	public StudentAction() {
		super();
		logger.info("intilazing the checkbox");
		hobbies=Arrays.asList("sports","music","dance","ride");
	}
	public String display()
	{
		logger.info("inside display method....");
		return NONE;
	}
private Student student;
	
	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	@Override
	public String execute() throws Exception {
//		if(!student.getName().equals("Sadik")) {
//	               throw new Exception();
//			}
//		if(student.getAge()<=15){
//			throw new NullPointerException();
//		}
		Map<String, Object>hashMap=new HashMap<String, Object>();
		hashMap.put("message", "Happy weekend");
		hashMap.put("fruits", Arrays.asList("dragon","orange"));
		//get the valuestack object
		ValueStack stack=ActionContext.getContext().getValueStack();
		//push  map data in the stack
		stack.push(hashMap);
		appSession.put("message", "Have a great day");
		appSession.put("fruits", Arrays.asList("apple", "kiwi","mango"));
		return SUCCESS;
	}

	

}
