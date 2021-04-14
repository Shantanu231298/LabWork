package com.capg.lab6;

import java.util.HashMap;
import java.util.Map;

public class Ex4Medals {
	public static HashMap<String, String> getStudents(HashMap<String, Integer> stud){
		HashMap<String,String> medal=new HashMap<String, String>();
		for(Map.Entry<String, Integer>values: stud.entrySet()) {
			if(values.getValue()>=90) {
				medal.put(values.getKey(), "Gold");
			}
			else if(values.getValue()<90 && values.getValue()>=80) {
				medal.put(values.getKey(), "Silver");
			}
			else {
				medal.put(values.getKey(), "Bronze");
			}
		}return medal;
	}
	public static void main(String[] args) {
		HashMap<String, Integer> stud= new HashMap<String, Integer>();
		stud.put("Shantanu",93);
		stud.put("Kartik",85);
		stud.put("Vikram",72);
		HashMap<String, String> map=getStudents(stud);
		for(Map.Entry<String, String> values:map.entrySet()) {
			System.out.println(values.getKey()+" : "+ values.getValue());
		}
	}

}
