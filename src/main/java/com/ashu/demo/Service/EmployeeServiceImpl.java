package com.ashu.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ashu.demo.DAO.EmployeeDaoImpl;
import com.ashu.demo.Model.Employee;
@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	public EmployeeDaoImpl employeeDao;
	
	@Override
	public List<Employee> getAllEmployee() {
		
		// TODO Auto-generated method stub
		return employeeDao.getAllEmployee();
	}

	@Override
	public Employee getEmployeeBySalary(Long salary) {
		// TODO Auto-generated method stub
		return employeeDao.getEmployeeBySalary(salary);
	}

}
