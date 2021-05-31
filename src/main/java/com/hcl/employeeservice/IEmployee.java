package com.hcl.employeeservice;

import java.util.List;

import com.hcl.bins.Employee;
import com.hcl.employeeexceptions.MyException;

public interface IEmployee {
	
	public Employee addEmployee (Employee emp) throws MyException;
	public Employee upDateEmp(int id,Employee emp) throws MyException;
	public String deleteEmp(int id) throws MyException;
	public List<Employee> getEmployeeDetails();
	public Employee searchById(int id) throws MyException;;
}
