package com.mindgate.main;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.mindgate.config.ApplicationConfig;
import com.mindgate.pojo.Employee;
import com.mindgate.service.EmployeeService;
import com.mindgate.service.EmployeeServiceInterface;

public class EmployeeCRUDMain {
	public static void main(String[] args) {
		Employee employee = new Employee(101, "BABA", 10202);
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ApplicationConfig.class);
		EmployeeServiceInterface employeeServiceInterface = applicationContext.getBean("employeeService",
				EmployeeService.class);
//		boolean result = employeeServiceInterface.addNewEmployee(employee);
//
//		if (result) {
//			System.out.println("Employee Added Successfully");
//		} else {
//			System.out.println("Failed to add New Employee");
//		}
//	}

//		List<Employee> allEmployees = employeeServiceInterface.getAllEmployees();
//
//		for (Employee employee2 : allEmployees) {
//			System.out.println(employee2);
//		}
//		System.out.println("-".repeat(100));
//		Employee rohit = employeeServiceInterface.getEmployeeByEmployeeId(23);
//		System.out.println(rohit);

		Employee employee1 = new Employee(4, "SHEELA", 250250);
		boolean result = employeeServiceInterface.updateEmployee(employee1);
		if (result) {
			System.out.println("Employee updated Successfully");
		} else {
			System.out.println("Failed to update Employee");

		}
	}
}