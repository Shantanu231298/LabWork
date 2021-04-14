package com.capg.lab6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class Ex1SortValues {
	public static ArrayList<String> getValues(HashMap<Integer, String> map){
		ArrayList<String> list= new ArrayList<String>(map.values());
		Collections.sort(list);
		return list;
	}

	public static void main(String[] args) {
		HashMap<Integer, String> map= new HashMap<Integer, String>();
		map.put(5,"Banana");
		map.put(1,"Apple");
		map.put(3,"Strawberry");
		map.put(2,"Grapes");
		map.put(4,"Lemon");
		ArrayList<String> list= getValues(map);
		System.out.println(list);
	}

}
