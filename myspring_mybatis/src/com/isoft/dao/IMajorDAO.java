package com.isoft.dao;

import java.util.List;

import com.isoft.model.Major;
import com.isoft.model.PageModel;

public interface IMajorDAO {
    int deleteByPrimaryKey(Integer majorId);

    int insert(Major record);

    int insertSelective(Major record);

    Major selectByPrimaryKey(Integer majorId);
    
    List selectAll(PageModel pageModel);

    int updateByPrimaryKeySelective(Major record);

    int updateByPrimaryKey(Major record);
}