package com.isoft.service;

import com.isoft.model.MyUser;

public interface ITrLoginService {

	public boolean login(MyUser user);
	
	public MyUser getUserById(String userId);
}
