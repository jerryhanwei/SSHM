package com.isoft.myinterface;
														 
public class ChineseBurningServiceImpl implements IBurningService{

	@Override
	public String collectMoney() {
		System.out.println("��Ǯ������1000");
		return null;
	}

	@Override
	public String buyMeet() {
		System.out.println("�����⴮������500");
		return null;
	}

	@Override
	public String goToPark() {
		System.out.println("ȥ��԰�տ�......");
		return null;
	}

	@Override
	public String backHome() {
		System.out.println("����ؼ�......");
		return null;
	}

}
