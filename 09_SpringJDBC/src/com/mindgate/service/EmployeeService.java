package com.mindgate.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.mindgate.dao.EmployeeDAOInterface;
import com.mindgate.pojo.Employee;

@Service("employeeService")
@Scope("prototype")
public class EmployeeService implements EmployeeServiceInterface {

	@Autowired
	private EmployeeDAOInterface employeeDAOInterface;

	@Override
	public boolean addNewEmployee(Employee employee) {
		System.out.println("inside EmployeeService addNewEmployee()");
		System.out.println(employee);
		return employeeDAOInterface.addNewEmployee(employee);
	}

	@Override
	public Employee getEmployeeByEmployeeId(int employeeId) {

		return (Employee) employeeDAOInterface.getEmployeeByEmployeeId(employeeId);
	}

	@Override
	public List<Employee> getAllEmployees() {
		return employeeDAOInterface.getAllEmployees();
	}

	@Override
	public boolean updateEmployee(Employee employee) {
		Employee employeeId;
		return employeeDAOInterface.updateEmployee(employee);
	}

	@Override
	public boolean deleteEmployeeByEmployeeId(int employeeId) {
		return employeeDAOInterface.deleteEmployeeByEmployeeId(employeeId);
	}

}
