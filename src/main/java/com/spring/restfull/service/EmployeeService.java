package com.spring.restfull.service;

import java.util.List;

import com.spring.restfull.model.Employee;

public interface EmployeeService {

	Employee saveEmployee(Employee employee);

	List<Employee> getAllEmployees();

	boolean isEmpty();
}
