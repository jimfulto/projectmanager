package com.projectmanager.projectmanager.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.projectmanager.projectmanager.model.Project;
import com.projectmanager.projectmanager.model.Task;
import com.projectmanager.projectmanager.model.User;
import com.projectmanager.projectmanager.service.ProjectService;
import com.projectmanager.projectmanager.service.TaskService;
import com.projectmanager.projectmanager.service.UserService;

@RestController
public class controller {
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private ProjectService projectService;
	
	@Autowired
	private TaskService taskService;
	
	@RequestMapping( value = "/controller/user/save", method = RequestMethod.POST)
	public ResponseEntity<?> saveUser(@RequestBody User user){
		User userResponse = userService.saveUser(user);
		if(null != userResponse) {
		   return ResponseEntity.ok(userResponse);
		}else {
			return ResponseEntity.status(HttpStatus.NOT_ACCEPTABLE).body(user);
		}
		
	}
	
	@RequestMapping( value = "/controller/user/getAll", method = RequestMethod.GET)
	public ResponseEntity<?> getAllUser(){
		List<User> userResponse = userService.findAlluser();
		if(null != userResponse) {
		   return ResponseEntity.ok(userResponse);
		}else {
			return ResponseEntity.status(HttpStatus.NOT_ACCEPTABLE).body(userResponse);
		}
		
	}
	
	@RequestMapping( value = "/controller/user/delete", method = RequestMethod.DELETE)
	public ResponseEntity<?> deleteUser(Long userId){
		 userService.deleteUserbyId(userId);
		return ResponseEntity.ok(HttpStatus.OK);
		
	}

	@RequestMapping( value = "/controller/user/update", method = RequestMethod.POST)
	public ResponseEntity<?> updateUser(@RequestBody User user){
		User userResponse = userService.saveUser(user);
		if(null != userResponse) {
		   return ResponseEntity.ok(userResponse);
		}else {
			return ResponseEntity.status(HttpStatus.NOT_ACCEPTABLE).body(user);
		}
		
	}
	
	@RequestMapping( value = "/controller/user/getUserbyId", method = RequestMethod.GET)
	public ResponseEntity<?> getUserbyId(Long userId){
		 userService.findUserById(userId);
		 return ResponseEntity.ok(HttpStatus.OK);
	}
	
	
	
	//PROJECT
	
	
	  
      @RequestMapping(value = "controller/project/save", method = RequestMethod.POST)
	  public ResponseEntity<?> saveProject(@RequestBody Project project){
		  ResponseEntity<?> response;
		  Project projectResponse = projectService.addProject(project);
		  if(null != projectResponse) {
			  return ResponseEntity.ok(projectResponse);
			  
		  }else {
				return ResponseEntity.status(HttpStatus.NOT_ACCEPTABLE).body(project);
			}
	  }
      
      @RequestMapping( value = "/controller/project/getAll", method = RequestMethod.GET)
  	public ResponseEntity<?> getAllProject(){
  		List<Project> projectResponse = projectService.getAllProject();            
  		if(null != projectResponse) {
  		   return ResponseEntity.ok(projectResponse);
  		}else {
  			return ResponseEntity.status(HttpStatus.NOT_ACCEPTABLE).body(projectResponse);
  		}
  		
  	}
      
      @RequestMapping( value = "/controller/project/delete", method = RequestMethod.DELETE)
  	public ResponseEntity<?> deleteProject(Long projectId){
  		 userService.deleteUserbyId(projectId);
  		return ResponseEntity.ok(HttpStatus.OK);
  		
  	}
      
      @RequestMapping( value = "/controller/project/update", method = RequestMethod.POST)
  	public ResponseEntity<?> updateProject(@RequestBody Project project){
  		Project projectResponse = projectService.updateProject(project);
  		if(null != projectResponse) {
  		   return ResponseEntity.ok(projectResponse);
  		}else {
  			return ResponseEntity.status(HttpStatus.NOT_ACCEPTABLE).body(project);
  		}
  		
    }
      
      @RequestMapping( value = "/controller/project/getProjectbyId", method = RequestMethod.GET)
		public ResponseEntity<?> getProjectbyId(Long projectId){
			 projectService.getProjectById(projectId);
			 return ResponseEntity.ok(HttpStatus.OK);
		}
		 
      //TASK
	  
      @RequestMapping(value = "controller/task/save", method = RequestMethod.POST)
	  public ResponseEntity<?> saveTask(@RequestBody Task task){
		  ResponseEntity<?> response;
		  Task taskResponse = taskService.addTask(task);
		  if(null != taskResponse) {
			  return ResponseEntity.ok(taskResponse);
			  
		  }else {
				return ResponseEntity.status(HttpStatus.NOT_ACCEPTABLE).body(task);
			}
	  }
      
      @RequestMapping( value = "/controller/task/getAll", method = RequestMethod.GET)
  	public ResponseEntity<?> getAlltask(){
  		List<User> taskResponse = userService.findAlluser();
  		if(null != taskResponse) {
  		   return ResponseEntity.ok(taskResponse);
  		}else {
  			return ResponseEntity.status(HttpStatus.NOT_ACCEPTABLE).body(taskResponse);
  		}
  		
  	}
    
    @RequestMapping( value = "/controller/task/delete", method = RequestMethod.DELETE)
  	public ResponseEntity<?> deleteTask(Long taskId){
  	taskService.deleteProject(taskId);
  	return ResponseEntity.ok(HttpStatus.OK);
  	}
    
    @RequestMapping( value = "/controller/task/update", method = RequestMethod.POST)
	public ResponseEntity<?> updateTask(@RequestBody Task task){
		Task taskResponse = taskService.updateTask(task);
		if(null != taskResponse) {
		   return ResponseEntity.ok(taskResponse);
		}else {
			return ResponseEntity.status(HttpStatus.NOT_ACCEPTABLE).body(task);
		}
		
	}
    
    @RequestMapping( value = "/controller/task/getTaskbyId", method = RequestMethod.GET)
	public ResponseEntity<?> getTaskbyId(Long taskId){
		 taskService.getTaskById(taskId);
		 return ResponseEntity.ok(HttpStatus.OK);
	}
        
}


 