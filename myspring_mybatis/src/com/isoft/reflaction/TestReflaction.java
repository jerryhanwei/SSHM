package com.isoft.reflaction;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

import org.junit.Test;

import com.isoft.model.MyUser;

public class TestReflaction {

	@Test
	public void test4() throws Exception{
		Class myClazz = new MyUser().getClass();
		Method method = myClazz.getMethod("hello");
		System.out.println(method.getName());
	}
	
	@Test
	public void test3() throws Exception{
		Class myClazz = new MyUser().getClass();
		Method[] methods = myClazz.getMethods();
		for(Method m : methods)
		{
			System.out.println(m.getName());
		}
		
	}
	
	@Test
	public void test1() throws Exception{
		Class myClazz = new MyUser().getClass();
		Field field = myClazz.getField("tUname");
		System.out.println(field.getName());
	}
	
	@Test
	public void test2() throws Exception{
		Class myClazz = new MyUser().getClass();
		Field[] fields = myClazz.getFields();
		for(Field filed : fields)
		{
			System.out.println(filed.getName());
		}
	}
	
	@Test
	public void test(){
		Class myClazz = new MyUser().getClass();
		
		Class myClazz2 = new MyUser().getClass();
		
		Class clazz2 = MyUser.class;
		System.out.println(clazz2==myClazz2);

		myClazz.getClass();
	}
	
	

	public Object getProperty(Object owner, String fieldName) throws Exception {
		Class ownerClass = owner.getClass();

		Field field = ownerClass.getField(fieldName);

		Object property = field.get(owner);

		return property;
	}

	public Object getStaticProperty(String className, String fieldName)
			throws Exception {
		// 通过这种方式获得类型的要注意，参数是包名+类名
		Class ownerClass = Class.forName(className);

		Field field = ownerClass.getField(fieldName);

		field.setAccessible(true);
		Object property = field.get(ownerClass);

		return property;
	}

	public Object invokeMethod(Object owner, String methodName, Object[] args)
			throws Exception {

		Class ownerClass = owner.getClass();

		Class[] argsClass = new Class[args.length];

		for (int i = 0, j = args.length; i < j; i++) {
			argsClass[i] = args[i].getClass();
		}

		Method method = ownerClass.getMethod(methodName, argsClass);

		return method.invoke(owner, args);
	}

}
