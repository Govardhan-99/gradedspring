package com.example.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.example.bins.Employee;
import com.example.dao.AccountRepository;
//import com.example.dao.EmployeeDAO;
import com.example.dao.EmployeeRepository;
import com.example.exception.MyException;




@Service
public class EmployeeServiceImple implements IEmployee {
	
	@Autowired
	private EmployeeRepository dao;
//	@Autowired
//	private AccountRepository account;
	
	public Employee  addEmployee(Employee emp) throws MyException {
		// return new EmployeeDAO().addEmployee(emp);
		if(!dao.findById(emp.getId()).isPresent()) {
			//account.save(emp.getAccount());
			return  dao.saveAndFlush(emp);
		}else
			throw new MyException("Id already exists");
	}

	public List<Employee> getEmployeeDetails() {
		//return new EmployeeDAO().getEmployeeDetails();
		return dao.findAll();
//		return dao.findAll(Sort.by(Direction.ASC,"salary"));
		
	}

	public Employee upDateEmp(int id,Employee emp) throws MyException {
		//return new EmployeeDAO().updateEmployee(id,emp);	
		if(dao.findById(id).isPresent()) {
			emp.setId(id);
			return dao.saveAndFlush(emp);
		}else
			throw new MyException("No Data to update");
	}

	public String deleteEmp(int id) throws MyException {
		 //return new EmployeeDAO().deleteEmployee(id);	
		if(dao.findById(id).isPresent()) {
			dao.deleteById(id);
			return "deleted successfully";
		}else
			throw new MyException("Data already deleted");

	}

	@Override
	public Employee searchById(int id) throws MyException {
		//return new EmployeeDAO().searchById(id);
		if(dao.findById(id).isPresent()) {
			return dao.findById(id).get();
		}else
			throw new MyException("No data is matched");
	}

//	@Override
//	public Employee searchByName(String name)  {
//		return dao.findByEmployeeName(name);
//	}
	



}
