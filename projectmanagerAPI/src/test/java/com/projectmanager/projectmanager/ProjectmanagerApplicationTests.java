package com.projectmanager.projectmanager;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.test.context.junit4.SpringRunner;

import com.projectmanager.projectmanager.model.User;
import com.projectmanager.projectmanager.service.ProjectService;
import com.projectmanager.projectmanager.service.UserService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProjectmanagerApplicationTests {

	@Test
	public void contextLoads() {
	}
	
	@LocalServerPort
	int randomServerPort;
	
	@Autowired
	private ProjectService projectService;
	
	@Autowired
	private UserService userService;
	}
	

