package com.isoft.myinterface;
														 
public class ChineseBurningServiceImpl implements IBurningService{

	@Override
	public String collectMoney() {
		System.out.println("收钱。。。1000");
		return null;
	}

	@Override
	public String buyMeet() {
		System.out.println("买羊肉串。。。500");
		return null;
	}

	@Override
	public String goToPark() {
		System.out.println("去公园烧烤......");
		return null;
	}

	@Override
	public String backHome() {
		System.out.println("吃完回家......");
		return null;
	}

}
