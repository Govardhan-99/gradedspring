package com.example.services;

import java.util.List;
import java.util.Optional;

import com.example.bins.Employee;
import com.example.exception.MyException;



public interface IEmployee {
	
	public Employee addEmployee (Employee emp) throws MyException;
	public Employee upDateEmp(int id,Employee emp) throws MyException;
	public String deleteEmp(int id) throws MyException;
	public List<Employee> getEmployeeDetails();
	public Employee searchById(int id) throws MyException;;
//	public Employee searchByName(String name);


}
