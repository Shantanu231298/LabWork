package com.capg.lab5;

import java.util.Scanner;

public class Ex2NameException {

	public static void main(String[] args) {
		System.out.println("enter the name");
		Scanner sc=new Scanner(System.in);
		String first_name= sc.next();
		String last_name= sc.next();
		check(first_name,last_name);
		
	}
	static void check(String first_name,String last_name) {
		try {
			if((first_name.isEmpty() ||  last_name.isEmpty())) {
				Ex2NameExceptionMethod e = new  Ex2NameExceptionMethod(); 
                throw e;
			}
			else {
				System.out.println("Full name is:"+first_name+" "+last_name );
			}
			
		}
		catch( Ex2NameExceptionMethod e) {
            System.out.println(e);
        }
	}

}
