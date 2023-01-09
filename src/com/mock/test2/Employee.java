package com.mock.test2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;



public class Employee{
	public List<String> getListElement(){
		LinkedList<String> list = new LinkedList<String>();
		list.add("Red");
		list.add("Blue");
		list.add("Green");
		list.add("Red");
		list.add("Blue");
		list.add("Red");
		list.add("Blue");
		list.add("Green");
		
		return list;
	}
	public static void main(String[] args) {
		Employee em = new Employee();
//		LinkedList<String> list = new LinkedList<String>();
//		list.add("Red");
//		list.add("Blue");
//		list.add("Green");
//		list.add("Red");
//		list.add("Blue");
//		list.add("Red");
//		list.add("Blue");
//		list.add("Green");
//		LinkedList<String> list = new LinkedList<String>();
//		list = (LinkedList<String>) em.getListElement();
		List<String> list = em.getListElement();
		System.out.println(list);
		LinkedList<String> list2 = new LinkedList<String>();
		
		for(String color : list) {
			if(color.equals("Red")) {
				list2.addFirst(color);
			}
			else if(color.equals("Blue")) {
				list2.add("Blue");
			}
		}
		for(String color:list) {
			if(color.equals("Green")) {
				list2.add(color);
			}
		}
		System.out.println(list2);
		
	}
	
		
}














