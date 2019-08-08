package com.projectmanager.projectmanager.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Task {
	
	@Id
	private Long task_Id;
	
	private String task;
	
	private Date startDate;
	
	private Date endDate;
	
	private Integer priority;
	
	private String status;

}
