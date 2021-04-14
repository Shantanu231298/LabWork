package com.cg.eis.service;

import com.cg.eis.bean.Employee;

public interface EmployeeService {
	Employee getEmployee(int id,String name,double salary,String designation,String insuranceScheme);
	void getinsuranceScheme(Employee emp);
	void displayAll(Employee emp);
}
