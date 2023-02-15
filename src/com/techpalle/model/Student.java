package com.techpalle.model;

public class Student
{
	private String name;
	private String email;
	private String subject;
	private String password;
	private Long mobile;
	
	
	public Student(String name, String email, String subject, String password, Long mobile) {
		super();
		this.name = name;
		this.email = email;
		this.subject = subject;
		this.password = password;
		this.mobile = mobile;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public long getMobile() {
		return mobile;
	}
	public void setMobile(Long mobile) {
		this.mobile = mobile;
	}
	
	
}
