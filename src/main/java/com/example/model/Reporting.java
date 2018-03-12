package com.example.model;

import java.sql.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
public class Reporting {
	
	@Id
	@Column(name = "reporting_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(name = "manager_id")
	private Long managerId;
	
	@Column(name = "reportee_id")
	private Long reporteeId;
	
	
	@Column(name = "area_id")
	private Long areaId;
	
	@Column(name = "created_by")
	private Date createdBy;
	
	@Column(name = "created_date")
	@JsonFormat(pattern = "YYYY-MM-dd")
	private Date createdDate;
	
	@Column(name = "updated_date")
	@JsonFormat(pattern = "YYYY-MM-dd")
	private Date updatedDate;
	
	
	public Reporting(){}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public Long getManagerId() {
		return managerId;
	}


	public void setManagerId(Long managerId) {
		this.managerId = managerId;
	}


	public Long getReporteeId() {
		return reporteeId;
	}


	public void setReporteeId(Long reporteeId) {
		this.reporteeId = reporteeId;
	}


	public Long getAreaId() {
		return areaId;
	}


	public void setAreaId(Long areaId) {
		this.areaId = areaId;
	}


	public Date getCreatedBy() {
		return createdBy;
	}


	public void setCreatedBy(Date createdBy) {
		this.createdBy = createdBy;
	}


	public Date getCreatedDate() {
		return createdDate;
	}


	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}


	public Date getUpdatedDate() {
		return updatedDate;
	}


	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}
	
	

}
