package com.isoft.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.google.gson.Gson;
import com.isoft.dao.IJobDao;
import com.isoft.model.TJob;
import com.isoft.service.IJobService;

@Service
public class JobService implements IJobService{

	@Resource(name="baseDao") 
    private IJobDao jobDao;
	@Override
	public String selectAll_Jobs() {
		return new Gson().toJson(jobDao.selectAll_Jobs());
	}

}
