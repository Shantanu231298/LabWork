package com.capg.lab1;

import java.util.Scanner;

public class Ex7checkNumber {
	static boolean checkNumber(int number) {
		int flag=0,digit1,digit2;
		while(number>9) {
			digit1=number%10;
			number=number/10;
			digit2=number%10;
			if(digit1>=digit2)
				break;
			else
				flag=1;
			
		
		}
		if(flag==0)
			return true;
		else
			return false;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of number");
		int number=sc.nextInt();
		System.out.println(checkNumber(number));

	}

}
