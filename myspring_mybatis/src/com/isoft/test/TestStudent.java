package com.isoft.test;

import com.isoft.model.Person;
import com.isoft.model.Student;

public class TestStudent {

	public static void main(String[] args) {
		
		
		//  gc    
		// ���ñ���   �����
		Student stu = new Student();

		stu.setSname("����");
		stu.setSage("41");
		
		
		Student stu1 = new Student();
		stu1.setSname("������");
		stu1.setSage("14");
		stu1.setGender("��");
		
		stu1.getSname();
		
		int i = 0;
		
		System.out.println(stu1.getSname());
		
	}
}
