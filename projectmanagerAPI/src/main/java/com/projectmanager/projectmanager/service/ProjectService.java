package com.projectmanager.projectmanager.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projectmanager.projectmanager.model.Project;
import com.projectmanager.projectmanager.model.User;
import com.projectmanager.projectmanager.repository.ProjectRepository;

@Service
public class ProjectService {
	
	@Autowired
	private ProjectRepository projectRepository;
	
	//CRUD
	
	public Project addProject(Project project) {
		return projectRepository.save(project);
	}
	
	public void deleteProject(Long projectId) {
		projectRepository.deleteById(projectId);
	}
	
	public List<Project> getAllProject(){
		return projectRepository.findAll();
	}
	
	public Project getProjectById(Long projectId) {
		return projectRepository.findById(projectId).get();
	}
	
	public Project updateProject(Project project) {
		return projectRepository.save(project);
		}



}
