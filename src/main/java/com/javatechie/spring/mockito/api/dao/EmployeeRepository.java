package com.javatechie.spring.mockito.api.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javatechie.spring.mockito.api.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
