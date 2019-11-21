package com.mindtree.learning.jpalearning.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

/**
 * @author M1027358 Jyoti Prakash Behera Jun 9, 2019
 */
@Entity
@Table(name = "TRACK_DETAILS")
@Data//for lombok
public class Track {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "ID")
	private int id;

	@Column(unique = true, name = "NAME")
	private String name;

	@Column(name = "LEAD_COUNT")
	private int leadCount;

	@Column(name = "CAMPUS_MIND_COUNT")
	private int campusMindCount;
}

	/*public Track() {
		super();
	}

	public Track(String name, int leadCount, int campusMindCount) {
		super();
		this.name = name;
		this.leadCount = leadCount;
		this.campusMindCount = campusMindCount;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getLeadCount() {
		return leadCount;
	}

	public void setLeadCount(int leadCount) {
		this.leadCount = leadCount;
	}

	public int getCampusMindCount() {
		return campusMindCount;
	}

	public void setCampusMindCount(int campusMindCount) {
		this.campusMindCount = campusMindCount;
	}
}*/
