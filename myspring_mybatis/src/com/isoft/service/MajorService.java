package com.isoft.service;

import org.codehaus.jettison.json.JSONException;
import org.springframework.stereotype.Service;

import com.isoft.model.Major;
import com.isoft.model.PageModel;

public interface MajorService {

	public Major getMajor(String majorId);

	public void addMajor(Major major);

	public void updateMajor(Major major);

	public void deleteMajor(String majorId);
	
	public String getAllMajorJSON(PageModel pageModel) throws JSONException;
	
	
	
}
