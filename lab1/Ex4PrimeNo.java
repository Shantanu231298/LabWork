package com.capg.lab1;

import java.util.Scanner;

public class Ex4PrimeNo {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			int count=0;
			for(int j=2;j<=i/2;j++)
			{
				if(i%j==0)
					{
						count++;
					}
			}
			if(count==0 && i!=1)
			{
				System.out.println(i);
			}
		}

	}

}
