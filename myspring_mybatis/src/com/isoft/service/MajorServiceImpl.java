package com.isoft.service;

import java.util.List;

import javax.annotation.Resource;

import org.codehaus.jettison.json.JSONArray;
import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;
import org.springframework.stereotype.Service;

import com.isoft.dao.IMajorDAO;
import com.isoft.dao.IMyUserDao;
import com.isoft.model.Major;
import com.isoft.model.MyUser;
import com.isoft.model.PageModel;

@Service("majorService")
public class MajorServiceImpl implements MajorService {

	@Resource(name = "majorDAO")  
	private IMajorDAO iMajorDAO;

	@Override
	public Major getMajor(String majorId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addMajor(Major major) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateMajor(Major major) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteMajor(String majorId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getAllMajorJSON(PageModel pageModel) throws JSONException {
		JSONObject jobjAll = new JSONObject();
		
		JSONArray jarray = new JSONArray();
		
	/*	Major major = iMajorDAO.selectByPrimaryKey(1);
		System.out.println(major.getName());*/
		
		
		List<Major> majorList = iMajorDAO.selectAll(pageModel);
		
		for(Major major : majorList)
		{
			/*System.out.println(major.getName());*/
			
			JSONObject jobj = new JSONObject();
			
			jobj.put("mcode", major.getCode());
		    jobj.put("mname", major.getName());
		    jobj.put("mtype", major.getType());
		    
		    jarray.put(jobj);
		}
		

		jobjAll.put("data", jarray);

		
		System.out.println(jobjAll.toString());
		return jobjAll.toString();
		
		
	}

	public IMajorDAO getiMajorDAO() {
		return iMajorDAO;
	}

	public void setiMajorDAO(IMajorDAO iMajorDAO) {
		this.iMajorDAO = iMajorDAO;
	}

	
	

	
}
