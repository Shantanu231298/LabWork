package com.capg.lab2;

import java.util.Arrays;
import java.util.Scanner;

public class Ex4modifyArray {
	static int[] modifyArray(int ar[],int n) {
		int [] t=new int[n];
		int j=0;
		for(int i=0;i<n;i++)
		{
			if(ar[i]!=ar[i+1])
			{
				t[j++]=ar[i];
			}
		}t[j++]=ar[n-1];
		for(int i=0;i<n;i++)
			ar[i]=t[i];
		Arrays.sort(ar);
		for(int k=0;k<n;k++)
		{
		for(int i=n-1;i>=0;i--)
		{
			t[k]=ar[i];
		}
		}
		return t;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length of array:");
		int n=sc.nextInt();
		int ar[]=new int[n];
		System.out.println("Enter the elemnts of array:");
		for(int i=0;i<n;i++)
		{
			ar[i]=sc.nextInt();
		}
		Ex4modifyArray ad=new Ex4modifyArray();
		ar=ad.modifyArray(ar,n);
		System.out.println("Array After removing duplicate elements sorting in descending order is:" +Arrays.toString(ar));
		
	}

}
