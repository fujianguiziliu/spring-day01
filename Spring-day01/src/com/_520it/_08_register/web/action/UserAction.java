package com._520it._08_register.web.action;

import lombok.Setter;

import com._520it._08_register.service.IUserService;

@Setter
public class UserAction {

	private IUserService userService ;
	
	private String username;
	private String password;
	
	public void register(){
		
		userService.register(username, password);
	
	}
}
