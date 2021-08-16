package com.example.shop.service;
import com.example.shop.bean.Login;
import com.example.shop.repository.LoginRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class LoginService {
	
	@Autowired
	private LoginRepo repo;
  
	public Login login(String username, String password) {
	  System.out.println(username+" "+password);
	  Login user = repo.findByUsernameAndPassword(username, password);
  	return user;
  }
	

}