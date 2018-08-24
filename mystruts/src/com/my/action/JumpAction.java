package com.my.action;

public class JumpAction {

	public String execute() {
		System.out.println("到了 默认 action");
		return "gotoHelloPage";
	}
	
	public String mydongtai() {
		System.out.println("到了 动态 action");
		return "gotoHelloPage";
	}
	
	
}
