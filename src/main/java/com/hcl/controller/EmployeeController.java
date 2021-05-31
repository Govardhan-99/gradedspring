package com.hcl.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.bins.Employee;
import com.hcl.employeeexceptions.MyException;
import com.hcl.employeeservice.EmployeeServiceImpl;


@RestController
public class EmployeeController {
	
	@Autowired
	EmployeeServiceImpl service;
	
	@PostMapping("/api/addemployee")
	public ResponseEntity<Employee> addEmployee(@RequestBody Employee emp) throws MyException {
		return new ResponseEntity<Employee>(service.addEmployee(emp), HttpStatus.OK);
	}
	
	@PutMapping("/api/updateemployee/{id}")
	public ResponseEntity<Employee> updateEmployee(@PathVariable int id, @RequestBody Employee emp) throws MyException {
		return new ResponseEntity<Employee>(service.upDateEmp(id, emp), HttpStatus.OK);
	}
	
	@DeleteMapping("/api/deleteemployee/{id}")
	public ResponseEntity<String> deleteEmployee(@PathVariable int id) throws MyException {
		return new ResponseEntity<String>(service.deleteEmp(id), HttpStatus.OK);
	}
	
	@GetMapping("/api/searchemployee/{id}")
	public ResponseEntity<Employee> searchById(@PathVariable int id) throws MyException {
		return new ResponseEntity<Employee>(service.searchById(id), HttpStatus.OK);
	}
	
	@GetMapping("/api/getemployees")
	public ResponseEntity<List<Employee>> getEmployees() {
		return new ResponseEntity<List<Employee>>(service.getEmployeeDetails(), HttpStatus.OK);
	}
}
