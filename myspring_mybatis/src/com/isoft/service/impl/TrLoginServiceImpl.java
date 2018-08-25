package com.isoft.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.isoft.dao.IUserDAO;
import com.isoft.dao.TrLoginDAO;
import com.isoft.model.MyUser;
import com.isoft.service.ITrLoginService;

@Service
public class TrLoginServiceImpl implements ITrLoginService{

	@Resource
	private IUserDAO userDao;
	
	@Override
	public boolean login(MyUser user) {
		
		return false;
	}

	@Override
	public MyUser getUserById(String userId) {
		return userDao.selectByPrimaryKey(userId);
	}

	
}
