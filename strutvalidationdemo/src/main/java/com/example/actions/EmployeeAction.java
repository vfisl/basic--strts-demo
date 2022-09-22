package com.example.actions;

import com.example.model.Employee;
import com.opensymphony.xwork2.ActionSupport;

public class EmployeeAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Employee employee;

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	@Override
	public String execute() throws Exception {
		//similar to calling service layer
		if(employee.getName().equals("Sri"))
		return SUCCESS;
		return ERROR;
	}
//
//	@Override
//	public void validate() {
//	
//		if(employee.getName().length()<=0)
//			addFieldError("employee.name", "Name is required");
//		if(employee.getAge()<20||employee.getAge()>70)
//			addFieldError("employee.age", "Age should be between 20 and 70");
//		if(employee.getCity().length()<=0)
//			addFieldError("employee.city", "City is required");
//		if(employee.getSalary()<=0)
//			addFieldError("employee.salary", "Name is required");
//		if(employee.getEmail().length()<=0)
//			addFieldError("employee.email", "Email is required");
//		if(!employee.getEmail().contains("@"))
//			addFieldError("employee.email", "enter valid mail");
//	}
//	
}
