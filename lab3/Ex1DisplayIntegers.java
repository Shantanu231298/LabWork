package com.capg.lab3;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Ex1DisplayIntegers {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the line of Integers with a (,) in between");
		String inp= sc.next();
		sc.close();
		int sum=0;
		StringTokenizer st=new StringTokenizer(inp, ",");
		while(st.hasMoreTokens()) {
			int n=0;
			n=Integer.parseInt(st.nextToken());
			System.out.println("The number is: "+n);
			sum+=n;
		}
		System.out.println("Sum of all integers is: "+sum);

	}

}
