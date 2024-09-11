package com.spring.restfull.service;

import java.util.List;

import com.spring.restfull.model.Employee;

public interface EmployeeService {

	Employee saveEmployee(Employee employee);

	List<Employee> getAllEmployees();

	boolean isEmpty();

	Employee getEmployeeById(Long id);

	Employee updateEmployee(Employee employee, Long id);

	void deleteEmployee(Long id);
}
