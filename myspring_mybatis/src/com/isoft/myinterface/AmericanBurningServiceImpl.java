package com.isoft.myinterface;

public class AmericanBurningServiceImpl implements IBurningService{

	@Override
	public String collectMoney() {
		System.out.println("�Լ���Ǯ");
		return null;
	}

	@Override
	public String buyMeet() {
		System.out.println("�Լ���ũ�����Լ�����");
		return null;
	}

	@Override
	public String goToPark() {
		System.out.println("��ͥ�ۻ� �����⴮");
		return null;
	}

	@Override
	public String backHome() {
		System.out.println("���� �ؼ�");
		return null;
	}

}
