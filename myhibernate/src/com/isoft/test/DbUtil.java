package com.isoft.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class DbUtil {
	
	private static DbUtil myDbUtil=null;
	// 1.构造函数 封死 2.给外界一个静态的获得本类唯一实例的方法
    // 3.建立类实例的属性 初始为null  4.在获得本类实例的时候判断实例属性是否为空
	    // 如果为空，进行唯一的一次实例化，如果不为空，把它返回给外界.
	private DbUtil(){
		
	}
	
	public static DbUtil getMyDbUtilInstance()
	{
		if(myDbUtil==null){
			 myDbUtil = new DbUtil();
		}
		return myDbUtil;
	}
	
	public Session getHwHibernateSession()
	{
		Configuration configuration = new Configuration().configure();
		ServiceRegistry serviceRegistry = (ServiceRegistry) new ServiceRegistryBuilder().applySettings(configuration.getProperties()).buildServiceRegistry();
		SessionFactory sessionFactory = configuration.buildSessionFactory(serviceRegistry);
		return sessionFactory.openSession();
		
	}
	
	public void test()
	{
		
	}
}
