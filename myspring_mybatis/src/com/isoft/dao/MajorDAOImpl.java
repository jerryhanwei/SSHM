package com.isoft.dao;

import java.util.List;

import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.stereotype.Repository;

import com.isoft.model.Major;
import com.isoft.model.PageModel;

@Repository(value="majorDAO")
public class MajorDAOImpl extends SqlSessionDaoSupport implements IMajorDAO{

	@Override
	public int deleteByPrimaryKey(Integer majorId) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insert(Major record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insertSelective(Major record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Major selectByPrimaryKey(Integer majorId) {
	  return this.getSqlSession().selectOne("com.isoft.dao.IMajorDAO.selectByPrimaryKey", "729c9806-35b6-4f1d-ade9-ae9268c70dd1");
	}

	@Override
	public int updateByPrimaryKeySelective(Major record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateByPrimaryKey(Major record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List selectAll(PageModel pageModel) {

			return this.getSqlSession().selectList("com.isoft.dao.IMajorDAO.selectAll",pageModel);
	}

}
