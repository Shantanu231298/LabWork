package com.cg.eis.pl;

import java.util.Scanner;

import com.cg.eis.bean.Employee;
import com.cg.eis.service.EmployeeService;
import com.cg.eis.service.EmployeeServiceImpl;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Id :");
		int eid=sc.nextInt();
		System.out.println("Enter Employee Name: ");
		String ename=sc.next();
		System.out.println("Enter Employee Salary: ");
		double esalary=sc.nextDouble();
		System.out.println("Choose a designation /t Executive Analyst /t Senior Analyst /t Analyst /tClerk");
		String edesignation=sc.next();
		sc.close();
		EmployeeService es=new EmployeeServiceImpl();
		String einsurancescheme=null;
		Employee emp= es.getEmployee(eid,ename,esalary,edesignation,einsurancescheme);
		es.getinsuranceScheme(emp);
		es.displayAll(emp);

	}

}
