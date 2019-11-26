package org.tutorial.spring.mvc.tuto.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.tutorial.spring.mvc.tuto.dao.EmployeeDAO;
import org.tutorial.spring.mvc.tuto.model.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService{
	
	@Autowired
	EmployeeDAO empDAO;

	@Override
	public List<Employee> getAllEmployees() {
		return empDAO.getAllEmployees();
	}

}
