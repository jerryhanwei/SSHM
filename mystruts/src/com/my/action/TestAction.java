package com.my.action;

import com.opensymphony.xwork2.ActionSupport;

public class TestAction extends ActionSupport{

	public String speak() {
		System.out.println("到了 固定方法 method");
		return "gotoHelloPage";
	}
}
