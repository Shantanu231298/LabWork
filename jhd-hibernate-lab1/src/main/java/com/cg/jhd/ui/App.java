package com.cg.jhd.ui;

import java.util.Scanner;

public class App {
	public static void main(String args[]) {
		CRUDOperation co=new CRUDOperation();
		System.out.println("1-Insert");
		System.out.println("2-Update");
		System.out.println("3-Delete");
		System.out.println("4-View By Author ID");
		System.out.println("Enter your Choice:");
		Scanner sc= new Scanner(System.in);
		int choice= sc.nextInt();
		switch (choice) {
		case 1:
			co.insertAuthor();
			break;
		case 2:
			co.updateAuthor();
			break;
		case 3:
			co.deleteAuthor();
			break;
		case 4:
			co.displayAuthor();
			break;
		default:
			System.out.println("Enter correct choice:s");
			break;
		}
		sc.close();
	}
}
