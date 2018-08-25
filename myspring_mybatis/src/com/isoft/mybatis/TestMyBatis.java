package com.isoft.mybatis;

import java.io.IOException;
import java.io.Reader;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import com.isoft.model.MyUser;
import com.isoft.model.TSysUser;

public class TestMyBatis {

	@Test
	public void test1() throws IOException
	{
		   Reader reader = Resources.getResourceAsReader("conf.xml"); 
	        //����sqlSession�Ĺ���
	         SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(reader);

	         SqlSession session = sessionFactory.openSession();

	        String statement = "com.isoft.mybatis.mapping.TSysUserMapper"; //ӳ��sql�ı�ʶ�ַ���
/*	        //ִ�в�ѯ����һ��Ψһuser�����sql
	        MyUser user = session.selectOne(statement+".selectByPrimaryKey",1);
	        System.out.println(user.gettUserName());*/
	        TSysUser user = session.selectOne(statement+".selectByPrimaryKey",1);
	        System.out.println(user.gettUserName());
	}
	
	@Test
	public void test2() throws IOException
	{
	        String statement = "com.isoft.mybatis.mapping.myuser";
	        
	        List<MyUser> userList =  DbUtil.getSqlSession().selectList(statement+".getAllUsers");
	        for(MyUser user : userList)
	        {
	        	System.out.println(user.gettUserName());
	        }

	}
	
	
}
