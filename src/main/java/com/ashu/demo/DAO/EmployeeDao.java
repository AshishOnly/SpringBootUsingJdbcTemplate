package com.ashu.demo.DAO;

import java.util.List;

import com.ashu.demo.Model.Employee;

public interface EmployeeDao  {

	public List<Employee> getAllEmployee();
	public Employee getEmployeeBySalary(Long salary);
	

}
