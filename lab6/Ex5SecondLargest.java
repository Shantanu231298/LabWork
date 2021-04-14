package com.capg.lab6;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Ex5SecondLargest {
	public static int getSecondSmallest(Integer[] a){
		List<Integer> list=Arrays.asList(a);  
		Collections.sort(list);  
		int ele=list.get(1);  
		return ele;  
	}
	public static void main(String[] args) {
		Integer a[]= {1,3,2,5,4,6,7}; 
		System.out.println("Second Smallest: "+getSecondSmallest(a));  
		 

	}

}
