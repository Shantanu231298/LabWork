package com.cg.lab1part1.dao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cg.lab1part1.entities.Employee;


@Component
public class EmployeeDaoImpl implements EmployeeDao {

	@Autowired
	private Employee employee;

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public Employee displayEmployeeDetails() {
		return employee;

	}

}
