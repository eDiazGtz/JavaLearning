package com.codingdojo.review2.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="messages")
public class Message {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String content;
	
	
	
	//Rels
	
	
	@Column(updatable = false)
	@DateTimeFormat(pattern = "yyyy-MM-DD HH:mm:ss")
	private Date createdAt;
	@DateTimeFormat(pattern = "yyyy-MM-DD HH:mm:ss")
	private Date updatedAt;

	@PrePersist
	protected void OnCreate() {
		this.createdAt = new Date();
	}

	@PreUpdate
	protected void OnUpdate() {
		this.updatedAt = new Date();
	}

	public Message() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public Date getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}

	

}
