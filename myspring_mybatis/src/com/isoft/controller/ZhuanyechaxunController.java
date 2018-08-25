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

@Controller
@Scope("prototype")
public class ZhuanyechaxunController {

	@Resource(name = "majorService")  
	private MajorService majorService;
	
	@RequestMapping(value="getZhuanyechaxunJSON",method=RequestMethod.GET)
	public void getZhuanyechaxunJSON(HttpServletRequest request,HttpServletResponse response) throws IOException, JSONException
	{
		int iDisplayStart = Integer.valueOf(request.getParameter("start"));
		int iDisplayLength = Integer.valueOf(request.getParameter("length"));
		
		PageModel pageModel = new PageModel();
		pageModel.setStartPage(iDisplayStart);
		pageModel.setLinePerPage(iDisplayLength);
		
		System.out.println("iDisplayLength------"+iDisplayLength+"---"+"iDisplayStart----"+iDisplayStart);
		response.setCharacterEncoding("utf-8");
		PrintWriter printWriter = response.getWriter();
		printWriter.write(majorService.getAllMajorJSON(pageModel));
	}

	
	
}
