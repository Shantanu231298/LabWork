package com.cg.lab1part3.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.cg.lab1part3.entities.Employee;


@Configuration
@ComponentScan("com.cg")
public class MyConfig {

	@Bean
	
	public Employee getEmployeeobj()
	{
		
		Employee employee=new Employee();
		
		return employee;
	}
}