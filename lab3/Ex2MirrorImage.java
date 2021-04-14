package com.capg.lab3;

import java.util.Scanner;

public class Ex2MirrorImage {
	public static String getImage(StringBuffer sb) {
		StringBuffer sb1=new StringBuffer(sb);
		sb1.reverse();
		String str1=sb1.toString();
		return str1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb=new StringBuffer();
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the String !!");
		sb.append(in.nextLine());
		in.close();
		System.out.println("Mirror Image:"+sb+"|"+getImage(sb));
		
	}

}
