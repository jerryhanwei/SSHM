package com.isoft.myinterface;

public class TestMyInterface {

	public static void main(String[] args) {
		//  接口指向实现类 
		
		IBurningService burningService = new ChineseBurningServiceImpl();
		
		burningService.collectMoney();
		burningService.buyMeet();
		burningService.goToPark();
		burningService.backHome();
		
	}
	
}
