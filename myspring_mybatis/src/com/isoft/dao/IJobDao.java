package com.isoft.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.isoft.model.TJob;
@Repository(value="myJobDao")
public interface IJobDao {
	List<TJob> selectAll_Jobs();
	
    int deleteByPrimaryKey(String tJobId);

    int insert(TJob record);

    int insertSelective(TJob record);

    TJob selectByPrimaryKey(String tJobId);
    
    TJob selectAll_Jobs(String tJobId);

    int updateByPrimaryKeySelective(TJob record);

    int updateByPrimaryKey(TJob record);
}