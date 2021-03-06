package com.cg.lab1part3.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cg.lab1part3.entities.Employee;
import com.cg.lab1part3.entities.Sbu;


@Component
public class Service {
	
	@Autowired
	Sbu sbu;

	@Autowired
	Employee emp;

	public Employee getEmp() {
		return emp;
	}

	public void setEmp(Employee emp) {
		this.emp = emp;
	}

	public void addEmployee(Employee emp) {

		sbu.getList().add(emp);

	}

	public List<Employee> getList() {
		List<Employee> l = sbu.getList();
		return l;
	}

	public Sbu getSbu() {
		return sbu;
	}

	public void setSbu(Sbu sbu) {
		this.sbu = sbu;
	}

}