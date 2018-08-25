package com.isoft.dao;

import org.springframework.stereotype.Repository;

import com.isoft.model.MyUser;

@Repository(value = "userDaoMapper")  
public class MyUserDao implements IMyUserDao {

	@Override
	public int deleteByPrimaryKey(String tUid) {
	    
		return 0;
	}

	@Override
	public int insert(MyUser record) {
		System.out.println("≤Â»Î");
		return 0;
	}

	@Override
	public int insertSelective(MyUser record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public MyUser selectByPrimaryKey(String tUid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int updateByPrimaryKeySelective(MyUser record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateByPrimaryKey(MyUser record) {
		// TODO Auto-generated method stub
		return 0;
	}

}
