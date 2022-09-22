package com.example.model;

public class Student {
	
	private String name;
	private String password;
	private int age;
	private String gender;
	private String courses;
	private long mobileno;
	private double allowance;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getCourses() {
		return courses;
	}
	public void setCourses(String courses) {
		this.courses = courses;
	}
	public long getMobileno() {
		return mobileno;
	}
	public void setMobileno(long mobileno) {
		this.mobileno = mobileno;
	}
	public double getAllowance() {
		return allowance;
	}
	public void setAllowance(double allowance) {
		this.allowance = allowance;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", password=" + password + ", age=" + age + ", gender=" + gender + ", courses="
				+ courses + ", mobileno=" + mobileno + ", allowance=" + allowance + "]";
	}
	

}
