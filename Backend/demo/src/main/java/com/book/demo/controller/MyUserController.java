package com.book.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.book.demo.entity.MyUser;
import com.book.demo.service.MyUserService;

@RestController
@CrossOrigin("*")
public class MyUserController {
	
	@Autowired
	MyUserService myUserSer;
	
	
	@GetMapping("four-wheeler/user/isValidUser")
	public Boolean checkUser(@RequestParam String  uName,String password) {
		
		System.out.println("from React Data----->");
		System.out.println("User NAme----->"+uName);
		System.out.println("Password----->"+password);
		
		Boolean res = myUserSer.checkUserIsValid(uName,password);
		
		return res;
	}
	
	
	@PostMapping("/varun-motors/user/add")
	public String addNewUser(@RequestBody MyUser myUser){
		
		System.out.println("data---->"+myUser);
		
		String res = myUserSer.addNewUserRecord(myUser);
		
		return res;
	}
	
	@PostMapping("/varun-motors/user/add/all")
	public String addAllNewUsers(@RequestBody List<MyUser> usersList){
		
		System.out.println("data---->"+usersList);
		
		String res = myUserSer.addAllNewUserRecords(usersList);
		
		return res;
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
















