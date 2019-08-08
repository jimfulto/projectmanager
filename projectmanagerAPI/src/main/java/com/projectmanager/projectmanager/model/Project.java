package com.projectmanager.projectmanager.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonFormat;


@Entity
public class Project {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private  Long project_Id;
	
	private String project;
	
	@JsonFormat(pattern = "MM-dd-yyyy")
	private Date startDate;
	
	@JsonFormat(pattern = "MM-dd-yyyy")
	private Date endDate;
	
	private Integer priority;

	public Long getProject_Id() {
		return project_Id;
	}

	public void setProject_Id(Long project_Id) {
		this.project_Id = project_Id;
	}

	public String getProject() {
		return project;
	}

	public void setProject(String project) {
		this.project = project;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public Integer getPriority() {
		return priority;
	}

	public void setPriority(Integer priority) {
		this.priority = priority;
	}
	
	

}

