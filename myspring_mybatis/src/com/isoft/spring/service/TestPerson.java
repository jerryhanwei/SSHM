package com.isoft.spring.service;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestPerson {

	public static void main(String[] args) {
	
		// 接口引用 指向 实现类 
		 
/*		Person chineseMan = new ChineseImpl();
		
		chineseMan.speak();*/
		
		ApplicationContext appContext = new ClassPathXmlApplicationContext("my_spring.xml");
		 
		Person chinese = (Person)appContext.getBean("mychinese");
		
		chinese.speak();
		
	}

}
