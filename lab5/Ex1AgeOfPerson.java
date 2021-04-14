package com.capg.lab5;

public class Ex1AgeOfPerson {

	public static void main(String[] args) {
		int age=12;
		check(age);  

	}

    static void check(int age) {
        
        try {
            
            if (age < 15) {
            	 Ex1AgeExceptionMethod e = new  Ex1AgeExceptionMethod(); // will replace this with user defined exception
                throw e;
            } else {
                System.out.println("Eligile i.e greater than 15");
            }
        }
        catch( Ex1AgeExceptionMethod e) {
            System.out.println(e);
        }
}
}