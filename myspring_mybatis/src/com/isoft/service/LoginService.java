package com.isoft.service;

public interface LoginService {
	
	public boolean login(String userName,String userPwd);
	
	public boolean logout();

	public boolean register();
	
	public boolean checkUserName();
	
	
}
