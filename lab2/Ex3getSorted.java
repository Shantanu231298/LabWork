package com.capg.lab2;
import java.util.Arrays;
import java.util.Scanner;

public class Ex3getSorted {
	static int reverseDigits(int no) 
	{ 
	    int revno=0; 
	    while (no!=0)
	    {
	        revno=(revno*10)+(no % 10); 
	        no=no/10; 
	    } 
	    return revno; 
	} 
	public int[] reverseArray(int ar[],int n)
	{
		
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=reverseDigits(ar[i]);
		}
		
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;++j) {
			if(a[i]>a[j])
			{
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
			}
		}
		return a;
	}


	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length of array:");
		int n=sc.nextInt();
		int ar[]=new int[n];
		System.out.println("Enter the elemnts of array:");
		for(int i=0;i<n;i++)
		{
			ar[i]=sc.nextInt();
		}
		Ex3getSorted ad=new Ex3getSorted();
		ar=ad.reverseArray(ar, n);
		System.out.println("Array After reversing and sorting is:" +Arrays.toString(ar));
		

		}

}
