package com.isoft.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.isoft.dao.IMyUserDao;
import com.isoft.model.MyUser;

@Service("userService")
public class UserServiceImpl implements UserService {

	   @Resource(name = "userDaoMapper")  
	private IMyUserDao userMapper;
	
	@Override
	public MyUser getUser(String userId) {
		return userMapper.selectByPrimaryKey(userId);
	}

	@Override
	public void addUser(MyUser user) {
		userMapper.insert(user);
		
	}

	@Override
	public void updateUser(MyUser user) {
		userMapper.updateByPrimaryKey(user);
		
	}

	@Override
	public void deleteUser(String UserId) {
		userMapper.deleteByPrimaryKey(UserId);
		
	}

	public IMyUserDao getUserMapper() {
		return userMapper;
	}

	public void setUserMapper(IMyUserDao userMapper) {
		this.userMapper = userMapper;
	}

	
}
