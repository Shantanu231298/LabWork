package com.capg.lab2;

import java.util.Scanner;

public class Ex2sortStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String[] s= new String[200];
		System.out.println("Enter the value of N");
		int n=sc.nextInt();
		System.out.println("Enter the strings");
		for(int i=0;i<n;i++)
		{
			s[i]=sc.next();
		}
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;++j)
			{
				if(s[i].compareTo(s[j])>0)
				{
					String temp=s[i];
					s[i]=s[j];
					s[j]=temp;
				}
			}
		}
		if(n%2==0)
		{
			for(int i=0;i<n/2;i++)
			{
				s[i].toUpperCase();
			}
			for(int i=n/2;i<n;i++)
			{
				s[i].toLowerCase();
			}
		}
		else
		{
			for(int i=0;i<n/2+1;i++)
			{
				s[i]=s[i].toUpperCase();
			}
			for(int i=n/2+1;i<n;i++)
			{
				s[i]=s[i].toLowerCase();
			}
		}
		System.out.println("The sorted array objects are:" );
		for(int i=0;i<n;i++)
			System.out.println(s[i]);

	}

}
