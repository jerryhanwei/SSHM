package com.isoft.myinterface;

public class TestMyInterface {

	public static void main(String[] args) {
		//  �ӿ�ָ��ʵ���� 
		
		IBurningService burningService = new ChineseBurningServiceImpl();
		
		burningService.collectMoney();
		burningService.buyMeet();
		burningService.goToPark();
		burningService.backHome();
		
	}
	
}
