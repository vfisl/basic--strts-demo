package com.example.struts2;

import com.opensymphony.xwork2.ActionSupport;

public class RegisterAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String username;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
	public String execute()
	{
		//this is the place to call service layer
		if(username.equals("Sri"))
			return "success";
		
		return "input";
	}
}
