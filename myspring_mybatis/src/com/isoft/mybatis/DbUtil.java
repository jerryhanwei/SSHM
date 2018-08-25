package com.isoft.mybatis;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class DbUtil {

	public static SqlSession getSqlSession() throws IOException
	{
		 	Reader reader = Resources.getResourceAsReader("conf.xml"); 
	        //构建sqlSession的工厂
	         SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(reader);

	         SqlSession session = sessionFactory.openSession();
	         
	         return session;
	}
}
