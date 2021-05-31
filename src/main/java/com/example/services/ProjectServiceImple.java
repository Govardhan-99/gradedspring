package com.example.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.bins.Project;
import com.example.dao.ProjectRepository;
import com.example.exception.MyException;
@Service
public class ProjectServiceImple implements IProject {
	
	@Autowired
	private ProjectRepository Pdao;
//	Get Project Details
	@Override
	public List<Project> getProjectDetails() {
		return Pdao.findAll();
	}
	
//	Add Project Details
	@Override
	public Project addProject(Project project) throws MyException {
		if(Pdao.findById(project.getProjectid()).isPresent())
			throw new MyException("Project with ID= "+project.getProjectid()+" is already exist");
		else
		   return Pdao.saveAndFlush(project);
	}

}
