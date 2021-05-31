package com.example.bins;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
@Entity
@Table(name="employee")
public class Employee {

//	private  int id;
//	private String name;
//	private String department;
//	private float salary;
	   
	@Id
//	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name="id")
	private  int id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="department")
	private String department;
	
	@Column(name="salary")
	private float salary;
	
//	@OneToMany
//	private Account Account;
}
