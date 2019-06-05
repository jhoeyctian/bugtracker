package com.ctianjhoey.bugtracker.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;

@Entity
public class Ticket {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column(length = 2000)
	private String description;

	private String status;
	private String title;
	

	@ManyToOne
	@JoinTable(
			name="ticket_release",
			joinColumns = @JoinColumn(name="ticket_id"),
			inverseJoinColumns = @JoinColumn(name="release_id")
			)
	private Releases release;

	
	public Ticket() {
	}
	
	public Ticket(Long id, String description, String status, String title) {
		super();
		this.id = id;
		this.description = description;
		this.status = status;
		this.title = title;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

}
