package com.my.action;

import com.opensymphony.xwork2.ActionContext;

public class MixAction {

	public String mix() {
		System.out.println("到了 mix 模糊动态 action");
		
		ActionContext.getContext().getSession().put("myname", "jerry");
		return "gotoHelloPage";
	}
}
