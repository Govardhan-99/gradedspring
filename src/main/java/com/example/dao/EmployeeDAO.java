package com.example.dao;


import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.bins.Employee;
import com.example.exception.MyException;
import com.example.util.DBConnection;


@Repository
public class EmployeeDAO 
{	
//	@Autowired
//	private JdbcTemplate template;

	public String addEmployee(Employee emp) throws MyException {
		JdbcTemplate template =DBConnection.getConnection();
		String sql="insert into employee values(?,?,?,?)";
		if(!exists(emp.getId())) {
		   template.update(sql,emp.getId(),emp.getName(),emp.getDepartment(),emp.getSalary());
		   return "Data added successfully";
		}else {
			throw new MyException("Employee_Id already exist");
		}		
	}
	
	public String updateEmployee(int id,Employee emp) throws MyException {
		JdbcTemplate template =DBConnection.getConnection();
		String sql="update employee set name=?,department=?,salary=? where id=?";
		if(exists(id)) {
			template.update(sql,emp.getName(),emp.getDepartment(),emp.getSalary(),id);
            return "updated successfully";
		}else {
			throw new MyException("No data to update");
		}
		
	}
	
	public List<Employee> getEmployeeDetails(){
		JdbcTemplate template =DBConnection.getConnection();
		String sql="select * from employee ";
		return template.query(sql,new EmployeeMapper());
		
	}
		
	public String deleteEmployee(int id) throws MyException {
		JdbcTemplate template =DBConnection.getConnection();
		String sql="delete from employee where id =?";
		if(exists(id)) {
			template.update(sql,id);
			return "Deleted Successfully";
		}else {
			throw new MyException("Data already Deleted");
		}
	}
	
	public List<Employee> searchById(int id) throws MyException {
		JdbcTemplate template =DBConnection.getConnection();
	
		String sql="select * from employee where id =?";
		if(exists(id)) {
			List<Employee> list=template.query(sql,new EmployeeMapper(),id);
			return list;
		}else {
			throw new MyException("No ID is mathced");
		}
		
	}
	public boolean exists(int id) {
		JdbcTemplate template =DBConnection.getConnection();
		String sql="select * from employee where id =?";
		List<Employee> list=template.query(sql,new EmployeeMapper(),id);
		if(list.size()==0)
			return false;
		else 
			return true;
	}
}
