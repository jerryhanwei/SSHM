package com.isoft.spring.service;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestPerson {

	public static void main(String[] args) {
	
		// �ӿ����� ָ�� ʵ���� 
		 
/*		Person chineseMan = new ChineseImpl();
		
		chineseMan.speak();*/
		
		ApplicationContext appContext = new ClassPathXmlApplicationContext("my_spring.xml");
		 
		Person chinese = (Person)appContext.getBean("mychinese");
		
		chinese.speak();
		
	}

}
