package org.tutorial.spring.mvc.tuto.dao;

import java.util.List;

import org.tutorial.spring.mvc.tuto.model.Employee;

public interface EmployeeDAO {
	public List<Employee> getAllEmployees();
}
