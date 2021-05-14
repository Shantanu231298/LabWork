package com.cg.lab1part3.main;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.cg.lab1part3.config.MyConfig;
import com.cg.lab1part3.entities.Employee;
import com.cg.lab1part3.entities.Sbu;
import com.cg.lab1part3.service.Service;



//Presentation layer would be responsible for handling all user interface and browser communication logic.
public class Main {
	
	Sbu sbu;

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();

		Class configurationClass = MyConfig.class;
		context.register(configurationClass);
		context.refresh();

		 Sbu sbu=context.getBean(Sbu.class);
		//to create an another object of employee
		Employee employee = context.getBean(Employee.class);

		employee.setEmployeeId(12346);
		employee.setEmployeeName("Ramesh");
		employee.setSalary(56000.2);


		Service service = context.getBean(Service.class);

		System.out.println("SBU Details ");
		System.out.println("-------------------------------");
		System.out.println("SBU Code="+sbu.getSbuId()+" SBU name="+sbu.getSbuName()+" SBU salary"+sbu.getSbuHead());
		System.out.println("Employee Details");
		System.out.println("---------------------------------------------------------------------------------");
		
		/**
		 * to add new object in list
		 */
		service.addEmployee(employee);
		
		/**
		 * service.addEmployee(employee2);
		 */
		System.out.println(sbu.getList());
	}

}


