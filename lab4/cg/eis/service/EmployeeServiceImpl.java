package com.cg.eis.service;

import com.cg.eis.bean.Employee;

public class EmployeeServiceImpl implements EmployeeService{

	@Override
	public Employee getEmployee(int id, String name, double salary, String designation, String insuranceScheme) {
		Employee emp=new Employee();
		emp.setId(id);
		emp.setName(name);
		emp.setSalary(salary);
		emp.setDesignation(designation);
		emp.setInsuranceScheme(insuranceScheme);
		return emp;
	}

	@Override
	public void getinsuranceScheme(Employee emp) {
		if(emp.getSalary()>50000 ) {
			if(emp.getDesignation().equals("Executive Analyst")) 
				emp.setInsuranceScheme("Scheme 1");
			
		}
		else if(emp.getSalary()>30000 && emp.getSalary()<=50000) {
			if(emp.getDesignation().equals("Senior Analyst")) 
				emp.setInsuranceScheme("Scheme 2");
			
		}
		else if(emp.getSalary()>10000 && emp.getSalary()<=30000) {
			if(emp.getDesignation().equals("Analyst")) 
				emp.setInsuranceScheme("Scheme 3");
			
		}
		else {
			if(emp.getDesignation().equals("Clerk")) 
				emp.setInsuranceScheme("Scheme 4");
			
		}
	}

		


	@Override
	public void displayAll(Employee emp) {
		System.out.println("Employee id :"+emp.getId());
		System.out.println("Employee Name: "+emp.getName());
		System.out.println("Employee Salary: "+emp.getSalary());
		System.out.println("Employee Designation: "+emp.getDesignation());
		System.out.println("Employee Scheme:"+emp.getInsuranceScheme());

		
	}

}
