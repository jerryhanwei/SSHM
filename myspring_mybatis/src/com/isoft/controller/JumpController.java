package com.isoft.controller;

import java.util.UUID;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class JumpController {

	@RequestMapping(value="toIndex",method=RequestMethod.GET)
	public String toIndex()
	{
		String hello = "123";
		String temp = new String();
		return "collegego/front/mainPage";
	}
	
	@RequestMapping(value="/toGaoxiaochaxun",method=RequestMethod.GET)
	public String toGaoxiaochaxun()
	{
		return "collegego/front/gaoxiaochaxun";
	}
	
	@RequestMapping(value="/toZhuanyechaxun",method=RequestMethod.GET)
	public String toZhuanyechaxun()
	{
		return "collegego/front/zhuanyechaxun";
	}
	
	@RequestMapping(value="/toJobsPage",method=RequestMethod.GET)
	public String toJobsPage()
	{
		return "jobFront/jobs";
	}
	
	
	
}
