package com.mindtree.learning.jpalearning.constant;

/**
 * @author M1027358 Jyoti Prakash Behera Jun 10, 2019
 */
public enum TrackConstants {
	SUCCESSFULLY_ADDED_TRACK("First track added successfully!!"),
	TRACK_ALREADY_EXIST("Track already exists!!");
	
	private String property;

	TrackConstants(String property) {
		this.property = property;
	}

	public String getProperty() {
		return property;
	}

}
