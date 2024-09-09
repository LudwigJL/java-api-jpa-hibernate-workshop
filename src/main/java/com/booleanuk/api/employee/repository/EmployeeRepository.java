package com.booleanuk.api.employee.repository;

import com.booleanuk.api.employee.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {



}