package com.capg.lab1;

import java.util.Scanner;

public class Ex8checkNumber {
	static boolean checkNumber(int n) {
		if(n==0)
			return false;
		while(n!=1)
		{
			if(n%2!=0)
				return false;
			n=n/2;
		}
		return true;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of number");
		int n=sc.nextInt();
		System.out.println(checkNumber(n));

	}

}
