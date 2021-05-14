package com.cg.lab1part1.main;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.cg.lab1part1.config.MyConfig;
import com.cg.lab1part1.dao.EmployeeDao;
import com.cg.lab1part1.dao.EmployeeDaoImpl;
import com.cg.lab1part1.entities.Employee;



public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
		EmployeeDao eDao = (EmployeeDaoImpl) context.getBean(EmployeeDaoImpl.class);
		Employee employee = eDao.displayEmployeeDetails();
		System.out.println("EMPLOYEE DETAILS");
		System.out.println("------------------------------------------------------------------------------");
		System.out.println("Employee Id :" +employee.getEmployeeId());
		System.out.println("Employee Name :" +employee.getEmployeeName());
		System.out.println("Employee Salary :" +employee.getSalary());
		System.out.println("Employee BU :" +employee.getBusinessUnit());
		System.out.println("Employee Age :" +employee.getAge());
		System.out.println("------------------------------------------------------------------------------");
	}

}
