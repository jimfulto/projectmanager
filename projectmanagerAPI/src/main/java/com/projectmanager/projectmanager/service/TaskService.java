package com.projectmanager.projectmanager.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projectmanager.projectmanager.model.Task;
import com.projectmanager.projectmanager.repository.TaskRepository;

@Service
public class TaskService {
	
	@Autowired
	private TaskRepository taskRepository;
	
	
	//CRUD
	
	public Task addTask(Task task) {
	return taskRepository.save(task);
	}
	
	public void deleteProject(Long taskId) {
		taskRepository.deleteById(taskId);
	}
	
	public List<Task> getAllTask(){
		return taskRepository.findAll();
	}
	
	public Task getTaskById(Long taskId) {
		return taskRepository.findById(taskId).get();
	}
	
	public Task updateTask(Task task) {
		return taskRepository.save(task);
	}
	
}
