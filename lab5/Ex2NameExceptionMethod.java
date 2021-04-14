package com.capg.lab5;

public class Ex2NameExceptionMethod extends Exception{
	public String toString() {
        return "first name or last name is NULL or empty";
    }
}
