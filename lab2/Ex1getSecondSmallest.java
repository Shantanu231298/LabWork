package com.capg.lab2;

import java.util.Scanner;

public class Ex1getSecondSmallest {
	static int getSecondSmallest(int ar[],int n) {
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;++j) {
			if(ar[i]>ar[j])
			{
				int temp=ar[i];
				ar[i]=ar[j];
				ar[j]=temp;
			}
			}
		}
		return ar[1];
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length of array:");
		int n=sc.nextInt();
		int ar[]=new int[100];
		System.out.println("Enter the elemnts of array:");
		for(int i=0;i<n;i++)
		{
			ar[i]=sc.nextInt();
		}
		System.out.println("The second smallest elemnt of array is:"+getSecondSmallest(ar,n));
	}

}
