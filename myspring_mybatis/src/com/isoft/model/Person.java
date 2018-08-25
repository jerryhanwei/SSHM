package com.isoft.model;

public abstract class Person {

	   private String sname;
	   private String sage;
	   private String gender;
	   
	   public abstract void hello();
	
	   
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getSage() {
		return sage;
	}
	public void setSage(String sage) {
		this.sage = sage;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	   
	   
}
