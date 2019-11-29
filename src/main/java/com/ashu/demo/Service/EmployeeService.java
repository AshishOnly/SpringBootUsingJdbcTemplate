package com.ashu.demo.Service;

import java.util.List;

import com.ashu.demo.Model.*;

public interface EmployeeService {

	public List<Employee> getAllEmployee();
	public Employee getEmployeeBySalary(Long salary);
	

	
}
