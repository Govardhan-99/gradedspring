package com.example.controller;

import java.util.List;
import java.util.Optional;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.bins.Account;
import com.example.bins.Employee;
import com.example.bins.Project;
import com.example.bins.Teacher;
import com.example.exception.MyException;
import com.example.services.IAccount;
import com.example.services.IEmployee;
import com.example.services.IProject;

@RestController
public class EmployeeController {

	@Autowired
	IEmployee service;
    @Autowired
    IProject project;
    @Autowired
    IAccount account;
    
	@PostMapping("/add")
	public ResponseEntity<Employee> addEmployee(@RequestBody Employee emp) throws MyException {
		return new ResponseEntity<Employee>(service.addEmployee(emp), HttpStatus.OK);
	}

	@DeleteMapping("/delete/{id}")
	public ResponseEntity<String> deleteEmployee(@PathVariable int id) throws MyException {
		return new ResponseEntity<String>(service.deleteEmp(id), HttpStatus.OK);
	}

	@PutMapping("/update/{id}")
	public ResponseEntity<Employee> updateEmployee(@PathVariable int id, @RequestBody Employee emp) throws MyException {
		return new ResponseEntity<Employee>(service.upDateEmp(id, emp), HttpStatus.OK);
	}

	@GetMapping("/search/{id}")
	public ResponseEntity<Employee> searchById(@PathVariable int id) throws MyException {
		return new ResponseEntity<Employee>(service.searchById(id), HttpStatus.OK);
	}

	@GetMapping("/display")
	public ResponseEntity<List<Employee>> getEmployees() {
		return new ResponseEntity<List<Employee>>(service.getEmployeeDetails(), HttpStatus.OK);
	}
	
	@GetMapping("/displayproject")
	public ResponseEntity<List<Project>> getProject(){
		return new ResponseEntity<List<Project>>(project.getProjectDetails(), HttpStatus.OK);

	}
	
	@PostMapping("/addproject")
	public ResponseEntity<Project> addProject(@RequestBody Project p) throws MyException {
		return new ResponseEntity<Project>(project.addProject(p), HttpStatus.OK);
	}
	
	@PostMapping("/addaccount")
	public ResponseEntity<Account> addAccount(@RequestBody Account ac) {
		return new ResponseEntity<Account>(account.addAccount(ac), HttpStatus.OK);
	}
	
	@GetMapping("/displayaccount")
	public ResponseEntity<List<Account>> getAccount(){
		return new ResponseEntity<List<Account>>(account.getAccounts(), HttpStatus.OK);

	}
	
	
	
//	@GetMapping("/search/{name}")
//	public ResponseEntity<Employee>searchByName(@PathVariable String name) {
//		return new ResponseEntity<Employee>(service.searchByName(name), HttpStatus.OK);
//	}
	
//	Controller Based Exception Handler
	@ExceptionHandler(MyException.class)
	public ResponseEntity<Object> globalExceptionHandler(HttpServletRequest req,Exception e){
		System.out.println("RuntimeException occured::URL="+req.getUserPrincipal()+"raised"+e);
		return new ResponseEntity<Object>(e.getMessage(),HttpStatus.OK);
	}
}





/*
 * @GetMapping("/hello") public Employee sayHello() { return e; }
 * 
 * @GetMapping("/Hindi") public Teacher hindi() { t.setSubject("Hindi");
 * t.setHomework("Do one page writing in Hindi");
 * t.setTips(" Do a lot of practice"); return t; }
 * 
 * @GetMapping("/Maths") public Teacher maths() { t.setSubject("Maths");
 * t.setHomework("Complete your first math exercise");
 * t.setTips(" Do a lot of practice"); return t; }
 * 
 * @GetMapping("/English") public Teacher english() { t.setSubject("English");
 * t.setHomework("Do one page writing in English");
 * t.setTips(" Do a lot of practice"); return t;
 * 
 */
