package com.isoft.dao;

import com.isoft.model.MyUser;

public interface IUserDAO {
    int deleteByPrimaryKey(String MyUserId);

    int insert(MyUser record);

    int insertSelective(MyUser record);

    MyUser selectByPrimaryKey(String MyUserId);

    int updateByPrimaryKeySelective(MyUser record);

    int updateByPrimaryKey(MyUser record);
}