package com.spring.restfull.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.restfull.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
