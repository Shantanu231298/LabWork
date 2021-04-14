package com.capg.lab1;

import java.util.Scanner;

public class Ex6calculateDifference {
	static int calculateDifference(int n) {
		int sum=0,sum1=0,sum2=0;
		for(int i=1;i<=n;i++)
		{
			sum1=sum1+(i*i);
			sum2=sum2+i;
			sum=sum1-(sum2*sum2);
		}
		return sum;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n=sc.nextInt();
		System.out.println(calculateDifference(n));

	}

}
