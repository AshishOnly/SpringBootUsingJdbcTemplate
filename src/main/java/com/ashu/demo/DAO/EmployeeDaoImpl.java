package com.ashu.demo.DAO;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.ashu.demo.Model.Employee;
import com.ashu.demo.Model.EmployeeRowMapper;

@Repository
public class EmployeeDaoImpl implements EmployeeDao{

	@Autowired
	public JdbcTemplate jdbcTemplate;
	
	
	
	@Override
	public List<Employee> getAllEmployee()
	{
		String query="SELECT * from employeedata";
		RowMapper<Employee> rowMapper=new EmployeeRowMapper();
		
		List<Employee> list = jdbcTemplate.query(query, rowMapper);
		
		// TODO Auto-generated method stub
		return list;
	}

	@Override
	public Employee getEmployeeBySalary(Long salary) {
		String query="SELECT emp_salary from employeedata";
		RowMapper<Employee> rowMapper=new BeanPropertyRowMapper<Employee>(Employee.class);
		Employee employee=jdbcTemplate.queryForObject(query, rowMapper, salary);
		
		// TODO Auto-generated method stub
		return employee;
	}

}
