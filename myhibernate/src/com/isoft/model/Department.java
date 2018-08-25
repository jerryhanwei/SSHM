package com.isoft.model;

import java.util.HashSet;
import java.util.Set;

public class Department {
	private String deptid;
	private String dname;
	//private Set<Employee> employees = new HashSet<Employee>();
	
	public String getDeptid() {
		return deptid;
	}
	public void setDeptid(String deptid) {
		this.deptid = deptid;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	
	
}
