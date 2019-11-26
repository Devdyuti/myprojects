package org.tutorial.spring.mvc.tuto.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.tutorial.spring.mvc.tuto.model.Employee;
import org.tutorial.spring.mvc.tuto.service.EmployeeService;

@Controller
@RequestMapping("employee")
public class EmployeeController {

	@Autowired
	EmployeeService empService;
	
	@RequestMapping(value="/getAllEmployees", method = RequestMethod.GET)
	public String getAllEmployees(Model model) {
		model.addAttribute("employees", empService.getAllEmployees());
		return "employeesListDisplay";
	}
	@RequestMapping(value ="/addEmployee", method = RequestMethod.GET)
	public String addEmployee() {
		return "employeeForm";
	}
	@RequestMapping(value ="/addEmployee", method = RequestMethod.POST)
	public ModelAndView addEmployee(Employee emp) {
		ModelAndView mv=new ModelAndView("employeeForm");
		mv.addObject("msg", "inserted Successfully");
		return mv;
	}
	
}
