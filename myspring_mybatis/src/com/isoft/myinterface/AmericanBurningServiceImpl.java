package com.isoft.myinterface;

public class AmericanBurningServiceImpl implements IBurningService{

	@Override
	public String collectMoney() {
		System.out.println("自己掏钱");
		return null;
	}

	@Override
	public String buyMeet() {
		System.out.println("自己有农场，自己剁肉");
		return null;
	}

	@Override
	public String goToPark() {
		System.out.println("家庭聚会 吃羊肉串");
		return null;
	}

	@Override
	public String backHome() {
		System.out.println("开车 回家");
		return null;
	}

}
