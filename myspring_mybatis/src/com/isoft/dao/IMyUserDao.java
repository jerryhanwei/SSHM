package com.isoft.dao;

import org.springframework.stereotype.Repository;

import com.isoft.model.MyUser;


public interface IMyUserDao {
    int deleteByPrimaryKey(String tUid);

    int insert(MyUser record);

    int insertSelective(MyUser record);

    MyUser selectByPrimaryKey(String tUid);

    int updateByPrimaryKeySelective(MyUser record);

    int updateByPrimaryKey(MyUser record);
}