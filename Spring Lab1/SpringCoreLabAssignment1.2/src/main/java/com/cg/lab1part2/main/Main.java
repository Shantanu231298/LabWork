package com.cg.lab1part2.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.cg.lab1part2.config.MyConfig;
import com.cg.lab1part2.entities.Employee;
import com.cg.lab1part2.entities.Sbu;


//Presentation layer would be responsible for handling all user interface and browser communication logic.

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
		Employee emp = (Employee) context.getBean(Employee.class);
		Sbu sbu = (Sbu) context.getBean(Sbu.class);
		Sbu sbuObject = emp.getSbuDetails();
		System.out.println("EMPLOYEE DETAILS");
		System.out.println("--------------------------------------------------------------------------------------");
		System.out.println("EMPLOYEE:" + emp);
		System.out.println("SBU DETAILS:" + sbuObject);
		System.out.println("--------------------------------------------------------------------------------------");
	}

}
