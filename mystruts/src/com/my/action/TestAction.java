package com.my.action;

import com.opensymphony.xwork2.ActionSupport;

public class TestAction extends ActionSupport{

	public String speak() {
		System.out.println("���� �̶����� method");
		return "gotoHelloPage";
	}
	
	public String dongtai()
	{
		System.out.println("���� ��̬���� method");
		return "gotoHelloPage";
	}
	
	
}
