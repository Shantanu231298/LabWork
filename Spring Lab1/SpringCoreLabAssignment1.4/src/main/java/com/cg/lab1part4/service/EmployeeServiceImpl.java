package com.cg.lab1part4.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cg.lab1part4.dao.EmployeeDao;
import com.cg.lab1part4.entities.Employee;

@Component
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeDao employeeDao;

	public EmployeeDao getEmployeeDao() {
		return employeeDao;
	}

	public void setEmployeeDao(EmployeeDao employeeDao) {
		this.employeeDao = employeeDao;
	}

	public Employee retrieveEmployeeInformation(int employeeId) {

		Employee emp = employeeDao.retrieveEmployeeInformation(employeeId);
		return emp;
	}

}
