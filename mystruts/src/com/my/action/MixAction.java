package com.my.action;

import com.opensymphony.xwork2.ActionContext;

public class MixAction {

	public String mix() {
		System.out.println("���� mix ģ����̬ action");
		
		ActionContext.getContext().getSession().put("myname", "jerry");
		return "gotoHelloPage";
	}
}
