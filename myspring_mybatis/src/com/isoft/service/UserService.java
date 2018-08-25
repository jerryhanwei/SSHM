package com.isoft.service;

import org.springframework.stereotype.Service;

import com.isoft.model.MyUser;

public interface UserService {

	public MyUser getUser(String userId);

	public void addUser(MyUser user);

	public void updateUser(MyUser user);

	public void deleteUser(String UserId);
}
