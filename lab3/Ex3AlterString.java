package com.capg.lab3;

import java.util.Scanner;

public class Ex3AlterString {
	public static boolean isVowel(char ch)
	{
		if(ch!='a' && ch!='e' && ch!='i' && ch!='o' &&ch!='u' && ch!='A' && ch!='E' && ch!='I' && ch!='O' &&ch!='U')
			return false;
		else
			return true;
	}
	public static String alterString(char [] str) {
		for(int i=0;i<str.length;i++) {
			
			if(!isVowel(str[i])) {
				if(str[i]=='z')
					str[i]='b';
				else if(str[i]=='Z')
					str[i]='B';
				else 
				{
					str[i]=(char)(str[i]+1);
					if(isVowel(str[i])) {
						str[i]=(char)(str[i]+1);
					}
				}
			}
			
		}
		return String.copyValueOf(str);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String s=sc.next();
		sc.close();
		System.out.println("String after alter is: "+alterString(s.toCharArray()));
	}

}
