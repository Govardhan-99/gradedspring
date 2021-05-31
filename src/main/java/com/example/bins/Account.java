package com.example.bins;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
@Entity
@Table(name = "Account")
public class Account {

	@Id
//	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name = "Account_Id")
	private int acId;
	@Column(name = "Branch_Name")
	private String branchName;
	
	@ManyToOne
	private Employee employee;

}
