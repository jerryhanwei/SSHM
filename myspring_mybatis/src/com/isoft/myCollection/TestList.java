package com.isoft.myCollection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class TestList {

	public static void main(String[] args) {
	  
		//  ����     1. List  Map  Vector 
		
		    // List   ����    ArrayList   LinkedList
		   //  Map   hashmap 
		   //   ����     
		List<String> tempList = new ArrayList<String>();
		List linkList = new LinkedList();
		
		tempList.add("hello");
		
		tempList.add("world");
		
	/*	for(int i=0;i<tempList.size();i++)
		{
			System.out.println(tempList.get(i));
		}*/
		
		for(String item : tempList)
		{
			//System.out.println(item);
		}
		
		//Object obj = new Object();
		

		Map<String,String> map = new HashMap();
		
		// �� ֵ ��
		map.put("1", "�й�");
		map.put("2", "����");
		
	     for(String key : map.keySet())
	     {
	    	 System.out.println(map.get(key));
	     }

	}

}
