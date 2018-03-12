package com.example.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.ManyToAny;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
public class Answers {
	
	@Id
	@Column(name = "answer_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private String title;
	
	private String description;
	
	private Boolean correctness;
	
	@Column(name = "created_by")
	private Date createdBy;
	
	@Column(name = "created_date")
	@JsonFormat(pattern = "YYYY-MM-dd")
	private Date createdDate;
	
	@Column(name = "updated_date")
	@JsonFormat(pattern = "YYYY-MM-dd")
	private Date updatedDate;
	
	
	@ManyToOne
	@JoinColumn(name="question_id",referencedColumnName="question_id")
	private Question question;
	
	public Answers(){}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
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
