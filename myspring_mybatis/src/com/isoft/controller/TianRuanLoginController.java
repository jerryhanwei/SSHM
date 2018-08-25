package com.isoft.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.isoft.dao.TrLoginDAO;
import com.isoft.model.MyUser;
import com.isoft.service.ITrLoginService;
import com.isoft.service.impl.TrLoginServiceImpl;

@Controller
public class TianRuanLoginController {

	@Resource
	private ITrLoginService iTrLoginService;
	
	@RequestMapping(value="toLoginPage",method=RequestMethod.GET)
	public String jumpToLoginPage()
	{
		
		System.out.println("mvc  ��ת  ����������");
		return "loginManagement/login";
	}
	
	@RequestMapping(value="tiantuan_login",method=RequestMethod.POST)
	public ModelAndView myLogin(HttpServletRequest request,HttpServletResponse response ,MyUser user,ModelAndView modelAndView)
	{
		
		MyUser users = iTrLoginService.getUserById("2");
		System.out.println(users.gettUserName());
		//modelAndView.setViewName("result");
		/*		if(!iTrLoginService.login(user))
		{
			request.setAttribute("tianruan_msg", "��½ʧ�ܣ�");
			return modelAndView;
		}
		
			String userName = request.getParameter("userName");
		String userPwd = request.getParameter("userPwd");
		
		System.out.println("�û���"+userName+"���룺"+userPwd);*/
		
		//System.out.println("�û���"+user.gettUname()+"���룺"+user.gettPwd());
		modelAndView.addObject("tianruan_msg", "��½�ɹ�!");
		modelAndView.setViewName("result");
		//request.setAttribute("tianruan_msg", "��½�ɹ���");
		return modelAndView;
	}
}
