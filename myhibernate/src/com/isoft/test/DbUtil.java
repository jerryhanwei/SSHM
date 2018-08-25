package com.isoft.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class DbUtil {
	
	private static DbUtil myDbUtil=null;
	// 1.���캯�� ���� 2.�����һ����̬�Ļ�ñ���Ψһʵ���ķ���
    // 3.������ʵ�������� ��ʼΪnull  4.�ڻ�ñ���ʵ����ʱ���ж�ʵ�������Ƿ�Ϊ��
	    // ���Ϊ�գ�����Ψһ��һ��ʵ�����������Ϊ�գ��������ظ����.
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
