package com.ctianjhoey.bugtracker.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Releases {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	private String version;
	private String updates;

	@ManyToOne
	@JoinColumn(name = "app_id")
	private Application application;

	public Releases() {
	}

	public Releases(Long id, String version, String updates, Application application) {
		super();
		this.id = id;
		this.version = version;
		this.updates = updates;
		this.application = application;
	}

	public Application getApplication() {
		return application;
	}

	public void setApplication(Application application) {
		this.application = application;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public String getUpdates() {
		return updates;
	}

	public void setUpdates(String updates) {
		this.updates = updates;
	}

}
