package com.example.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.bins.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Integer>{

//	public Employee findByEmployeeName(String name);
}
