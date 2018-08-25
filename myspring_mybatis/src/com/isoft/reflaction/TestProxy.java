package com.isoft.reflaction;

import org.junit.Test;


interface IPerson {
	
	public void speak();
	
}
//  真实类 
class Manager implements IPerson{

	@Override
	public void speak() {

		System.out.println("今天不开会了");
	}
	
	
}
//  代理类 
class Secretary  implements IPerson{

	public IPerson person;

	public Secretary(IPerson person) {
		this.person = person;
	}

	@Override
	public void speak() {
		System.out.println("准备开会哦");
		
		person.speak();
		
	}
	
}

public class TestProxy {

	@Test
	   public void testProxy()
	   {
		   IPerson person = new Manager();
		   Secretary sec = new Secretary(person);
		   sec.speak();
		   
	   }
	
}
