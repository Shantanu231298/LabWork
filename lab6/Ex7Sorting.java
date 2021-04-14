package com.capg.lab6;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Ex7Sorting {
	public static List<Integer> getSorted(Integer[] a){
		List<Integer> list=Arrays.asList(a); 
		Collections.reverse(list);
		return list;
	
	}
	public static void main(String[] args) {
		Integer  a[]= {1,2,3,4,5};
	
		System.out.println(getSorted(a));
	}

}
