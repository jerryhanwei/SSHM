package com.isoft.test;

import com.isoft.model.Person;
import com.isoft.model.Student;

public class TestStudent {

	public static void main(String[] args) {
		
		
		//  gc    
		// 引用变量   类变量
		Student stu = new Student();

		stu.setSname("王震");
		stu.setSage("41");
		
		
		Student stu1 = new Student();
		stu1.setSname("王开照");
		stu1.setSage("14");
		stu1.setGender("男");
		
		stu1.getSname();
		
		int i = 0;
		
		System.out.println(stu1.getSname());
		
	}
}
