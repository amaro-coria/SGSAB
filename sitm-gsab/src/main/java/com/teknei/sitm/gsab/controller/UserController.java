package com.teknei.sitm.gsab.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.teknei.sitm.gsab.service.UserAccessServicce;

@Component
public class UserController {

	@Autowired
	private UserAccessServicce serviceAccess;
	
	public boolean authenticate(String username, String password){
		boolean b = serviceAccess.access(username, password);
		return b;
	}
	
}
