package com.isoft.model;

public class MyUser {
	
    private String tUserId;

    private String tUserName;

    private Integer tAge;

    private String tAddress;

	public String gettUserId() {
		return tUserId;
	}

	public void settUserId(String tUserId) {
		this.tUserId = tUserId;
	}

	public String gettUserName() {
		return tUserName;
	}

	public void settUserName(String tUserName) {
		this.tUserName = tUserName;
	}

	public Integer gettAge() {
		return tAge;
	}

	public void settAge(Integer tAge) {
		this.tAge = tAge;
	}

	public String gettAddress() {
		return tAddress;
	}

	public void settAddress(String tAddress) {
		this.tAddress = tAddress;
	}

    
}