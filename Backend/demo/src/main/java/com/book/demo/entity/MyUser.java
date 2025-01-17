package com.book.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class MyUser {
	
	@Id
	private String userName;
	private String password;
	public MyUser() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "MyUser [userName=" + userName + ", password=" + password + "]";
	}
	
	
	
	

}