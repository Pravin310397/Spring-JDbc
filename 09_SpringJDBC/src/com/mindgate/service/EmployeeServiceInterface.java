package com.mindgate.service;

import java.util.List;

import com.mindgate.pojo.Employee;

public interface EmployeeServiceInterface {
	
	public boolean addNewEmployee(Employee employee);
	public Employee getEmployeeByEmployeeId(int employeeId);
	public List<Employee> getAllEmployees();
	
	public boolean updateEmployee(Employee employee);
	public boolean deleteEmployeeByEmployeeId(int employeeId);

}
