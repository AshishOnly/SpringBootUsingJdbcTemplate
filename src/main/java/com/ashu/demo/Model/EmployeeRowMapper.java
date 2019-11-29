package com.ashu.demo.Model;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class EmployeeRowMapper implements RowMapper<Employee> {

	
	@Override
	public Employee mapRow(ResultSet rs, int rowNum) throws SQLException{
		Employee employee=new Employee();
		
		employee.setId(rs.getInt("id"));
		employee.setName(rs.getString("emp_name"));
		employee.setSalary(rs.getLong("emp_salary"));
		
		return employee;
	}

}
