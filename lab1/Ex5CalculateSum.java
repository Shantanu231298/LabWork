package com.capg.lab1;

import java.util.Scanner;

public class Ex5CalculateSum {
	static int calculateSum(int n){
		int sum=0;
		for(int i=1;i<=n;i++)
		{
			if(i%3==0 || i%5==0)
			{
				sum=sum+i;
			}
		}
		return sum;
	}


	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n=sc.nextInt();
		System.out.println(calculateSum(n));
		

	}

}
