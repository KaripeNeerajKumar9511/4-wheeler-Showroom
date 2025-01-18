package com.book.demo.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.book.demo.entity.MyUser;
import com.book.demo.repo.MyUserRepo;

@Service
public class MyUserService {

	@Autowired
	MyUserRepo myUserRepo;
	
	
	public Boolean checkUserIsValid(String uName, String password) {
		
		Boolean res = false;
		
		MyUser myUser = myUserRepo.findById(uName).orElse(new MyUser());
		
		if(myUser.getUserName() != null) {
			
			if(myUser.getUserName().contentEquals(uName)) {
				if(myUser.getPassword().contentEquals(password)) {
					
					res = true;
				}
			}
		}
		
		
		return res;
	}


	public String addNewUserRecord(MyUser myUser) {
		String res = "";
		try {
			myUserRepo.save(myUser);
			res = "Successfully add new   User----->"+myUser.getUserName();
		}catch(Exception e) {
			res = "not able to save new User--->"+myUser.getUserName();
		}

		return res;
		
	}


	public String addAllNewUserRecords(List<MyUser> usersList) {
		String res = "";
		try {
			myUserRepo.saveAll(usersList);
			res = "Successfully added All new   Users----->"+usersList;
		}catch(Exception e) {
			res = "not able to save new User--->"+usersList;
		}

		return res;
}

}