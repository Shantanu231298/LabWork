package com.capg.lab1;

import java.util.Scanner;

public class Ex3fibSeries {
	static int no1=0,no2=1,no3;
	static void fib(int n) {
		if(n>0)
		{
			no3=no2+no1;
			no1=no2;
			no2=no3;
			System.out.print(" "+no3);
			fib(n-1);
		}
	}
	
	public static void main(String[] args) {
		int n,n1=0,n2=1,n3;
		System.out.println("Enter value of n till you want to print:");
		Scanner sc= new Scanner(System.in);
		n=sc.nextInt();
		System.out.print("Fibonacci Series without recursion is:"+n1+" "+n2);
		for(int i=0;i<n-2;i++) {
			n3=n2+n1;
			System.out.print(" "+n3);
			n1=n2;
			n2=n3;
		}System.out.println();
		System.out.print("Fibonacci Series without recursion is:"+no1+" "+no2);
		fib(n-2);
		
		
		
	}

}
