package com.bugtracking.bug.dto;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.bugtracking.bug.entities.Employee;
import com.bugtracking.bug.entities.Project;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel("Bug Entity")
public class BugDto {
	private long bid;
	@NotEmpty
	@ApiModelProperty("Name should not be empty")
	private String bugDesc;
	@NotEmpty
	@ApiModelProperty("Status should not be empty")
	private String status;
	private Date startDate;
	private Date endDate;
	private Employee employee;
	@NotEmpty
	@ApiModelProperty("Bug Type should not be empty")
	private String type;
	@NotEmpty
	@ApiModelProperty("Bug priority should not be empty")
	private String priority;
	private Project project;

	public Project getProject() {
		return project;
	}

	public void setProject(Project project) {
		this.project = project;
	}

	public long getBid() {
		return bid;
	}

	public void setBid(long bid) {
		this.bid = bid;
	}

	public String getBugDesc() {
		return bugDesc;
	}

	public void setBugDesc(String bugDesc) {
		this.bugDesc = bugDesc;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
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

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getPriority() {
		return priority;
	}

	public void setPriority(String priority) {
		this.priority = priority;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public BugDto(long bid, String bugDesc, String status, Date startDate, Date endDate, Employee employee, String type,
			String priority, Project project) {
		super();
		this.bid = bid;
		this.bugDesc = bugDesc;
		this.status = status;
		this.startDate = startDate;
		this.endDate = endDate;
		this.type = type;
		this.priority = priority;
		this.employee = employee;
		this.project = project;
	}

	public BugDto() {

	}
}