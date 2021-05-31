package com.example.bins;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "project")
public class Project {
	
	@Id
	@Column(name = "project_id")
	private int projectid;
	@Column(name = "project_name")
	private String projectname;
	
	@OneToOne
	private Employee employee;
	

}
