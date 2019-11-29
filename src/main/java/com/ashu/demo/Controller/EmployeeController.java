package com.ashu.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.ashu.demo.Model.Employee;
import com.ashu.demo.Service.EmployeeServiceImpl;

@Controller
public class EmployeeController {
	
	@Autowired
	public EmployeeServiceImpl employeeService;
	

	 @RequestMapping(value= {"employees"}, method=RequestMethod.GET)
	public ModelAndView getAllEmployee(){
		  ModelAndView model = new ModelAndView();
	List<Employee> employees=employeeService.getAllEmployee();
	  
	  model.addObject(employees);
	  
	return model;
	}
	
	@GetMapping("/emloyees/{employeeSalary}")
	public Employee getEmployee(@PathVariable(name="employeeSalary")Long employeeSalary){
		return employeeService.getEmployeeBySalary(employeeSalary);
	}
	
	
	
}
