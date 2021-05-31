package com.hcl.employeeservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.bins.Employee;
import com.hcl.employeeexceptions.MyException;
import com.hcl.repository.IEmployeeRepository;

@Service
public class EmployeeServiceImpl  implements IEmployee{
	@Autowired
	IEmployeeRepository empdao;
	
	@Override
	public Employee addEmployee(Employee emp) throws MyException {
		if(empdao.findById(emp.getId()).isPresent())
			throw new MyException("ID already exists");
		else
			return empdao.saveAndFlush(emp) ;
	}

	@Override
	public Employee upDateEmp(int id, Employee emp) throws MyException {
		if(empdao.findById(id).isPresent()) {
			emp.setId(id);
			return empdao.saveAndFlush(emp);
		}else
			throw new MyException("ID is not  available to update");

	}

	@Override
	public String deleteEmp(int id) throws MyException {
		if(empdao.findById(id).isPresent()) {
			empdao.deleteById(id);
			return "Data Deleted Successfully";
		}else
			throw new MyException("Data already deleted");

	}

	@Override
	public List<Employee> getEmployeeDetails() {
		return empdao.findAll();
	}

	@Override
	public Employee searchById(int id) throws MyException {
		if(empdao.findById(id).isPresent())
			return empdao.findById(id).get();
		else 
			throw new MyException("Data already deleted");

	}

}
