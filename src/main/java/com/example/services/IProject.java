package com.example.services;

import java.util.List;

import com.example.bins.Project;
import com.example.exception.MyException;

public interface IProject {
	public Project addProject(Project project) throws MyException;
	public List< Project> getProjectDetails();
}
