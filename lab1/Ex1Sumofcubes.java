package com.capg.lab1;
import java.util.Scanner;
public class Ex1Sumofcubes {
	static int no;
	static int getSum(int n) {
		int sum=0;
		int digit;
		while(n!=0)
		{
			digit=n%10;
			sum=sum+(digit*digit*digit);
			n=n/10;
		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		no=sc.nextInt();
		System.out.println(getSum(no));

	}

}
