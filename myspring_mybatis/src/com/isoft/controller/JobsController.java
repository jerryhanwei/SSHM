package com.isoft.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.codehaus.jettison.json.JSONArray;
import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.isoft.model.PageModel;
import com.isoft.service.MajorService;
import com.isoft.service.impl.JobService;

@Controller
@Scope("prototype")
public class JobsController {

	@Resource
	private JobService jobService;
	
	@RequestMapping(value="getAllJobsJSON",method=RequestMethod.GET)
	public void getAllJobsJSON(HttpServletRequest request,HttpServletResponse response) throws IOException, JSONException
	{
		
		response.setCharacterEncoding("utf-8");
		PrintWriter printWriter = response.getWriter();
		System.out.println(jobService.selectAll_Jobs());
		printWriter.write(jobService.selectAll_Jobs());
	}

	
	
}
