package com.isoft.reflaction;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import org.junit.Test;


interface IPersonNterface {
	
	public void speak();
	
}
//  真实类 
class ManagerBoss implements IPersonNterface{

	@Override
	public void speak() {

		System.out.println("今天不开会了");
	}
	
	
}
//  代理类 
class SecretaryMiss  implements InvocationHandler{

	Object obj = null;
	
	public SecretaryMiss(Object managerBoss) {
		this.obj = managerBoss;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		
		return method.invoke(obj, args);
	}
	
}

public class TestDanymicProxy {

	@Test
	   public void testProxy()
	   {
			IPersonNterface person = new ManagerBoss();
			
			InvocationHandler handler = new SecretaryMiss(person);
		   
		   ClassLoader loader = handler.getClass().getClassLoader();
		   
		   Class<?>[] interfaces = person.getClass().getInterfaces();
		   
		   IPersonNterface proxyInterface = (IPersonNterface) Proxy.newProxyInstance(loader,interfaces, handler);
		   
		   proxyInterface.speak();
		   
		   
	
		   
	   }
	
}
