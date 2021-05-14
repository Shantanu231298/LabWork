package com.cg.lab1part4.main;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.cg.lab1part4.config.MyConfig;
import com.cg.lab1part4.service.EmployeeServiceImpl;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
		EmployeeServiceImpl empService = (EmployeeServiceImpl) context.getBean(EmployeeServiceImpl.class);
		System.out.println("Employee Info :");
		System.out.println(empService.retrieveEmployeeInformation(1));
	}

}
