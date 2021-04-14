package com.capg.lab6;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class Ex3SquareNos {
	public static HashMap<Integer, Integer> getSquares(int [] arr){
		HashMap<Integer, Integer> hmap=new HashMap<Integer, Integer>();
		for(int i:arr) {
			hmap.put(i, (i*i));
		}
		return hmap;
	}
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the array");
		int [] ar=new int[5];
		for(int i=0;i<5;i++) {
			ar[i]=sc.nextInt();	
			}sc.close();
		HashMap<Integer, Integer> map= getSquares(ar);
		Iterator<Integer> it= map.keySet().iterator();
		while(it.hasNext()) {
			Integer key=it.next();
			System.out.println(key+" : "+map.get(key));
		}
	}

}
