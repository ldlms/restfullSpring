package com.spring.restfull.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.restfull.exeption.RessourceNotFound;
import com.spring.restfull.model.Employee;
import com.spring.restfull.repository.EmployeeRepository;
import com.spring.restfull.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	private EmployeeRepository employeeRepository;

	@Autowired
	public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
		super();
		this.employeeRepository = employeeRepository;
	}

	@Override
	public Employee saveEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return employeeRepository.save(employee);
	}

	@Override
	public List<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
		return employeeRepository.findAll();
	}

	@Override
	public boolean isEmpty() {
		if (employeeRepository.findAll().isEmpty()) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public Employee getEmployeeById(Long id) {

		// Optional<Employee> employee = employeeRepository.findById(id);
		// if (employee.isPresent()) {
		// return employee.get();
		// } else {
		// throw new RessourceNotFound("employee", "id", id);
		// }
		return employeeRepository.findById(id).orElseThrow(() -> new RessourceNotFound("employee", "id", id));
	}

	@Override
	public Employee updateEmployee(Employee employee, Long id) {

		Employee oldEmployee = employeeRepository.findById(id)
				.orElseThrow(() -> new RessourceNotFound("employee", "id", id));
		oldEmployee.setFirstname(employee.getFirstname());
		oldEmployee.setLastname(employee.getLastname());
		oldEmployee.setEmail(employee.getEmail());
		return employeeRepository.save(oldEmployee);
	}

	@Override
	public void deleteEmployee(Long id) {
		employeeRepository.findById(id).orElseThrow(() -> new RessourceNotFound("employee", "id", id));
		employeeRepository.deleteById(id);
	}

}
