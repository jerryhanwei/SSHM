package com.isoft.myCollection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class TestList {

	public static void main(String[] args) {
	  
		//  集合     1. List  Map  Vector 
		
		    // List   链表    ArrayList   LinkedList
		   //  Map   hashmap 
		   //   泛型     
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
		
		// 键 值 对
		map.put("1", "中国");
		map.put("2", "美国");
		
	     for(String key : map.keySet())
	     {
	    	 System.out.println(map.get(key));
	     }

	}

}
