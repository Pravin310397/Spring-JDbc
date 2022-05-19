package com.mindgate.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.mindgate.pojo.Employee;

public class EmployeeRowmapper implements RowMapper<Employee> {

	@Override
	public Employee mapRow(ResultSet resultSet, int i) throws SQLException {
		int employeeId= resultSet.getInt("EMPLOYEE_ID");
		String name = resultSet.getString("NAME");
		double salary= resultSet.getDouble("SALARY");
		Employee employee = new Employee(employeeId, name,	 salary);
		
		return employee;
	}
	
	

}
