package com.mindtree.learning.jpalearning.exception;

/**
 * @author M1027358 Jyoti Prakash Behera Jun 10, 2019
 */
public class TrackCreationException extends TrackException {
	/**
	 * 
	 */
	private static final long serialVersionUID = -5132878348271150919L;

	public TrackCreationException() {
	}

	public TrackCreationException(String message, Throwable cause) {
		super(message, cause);
	}

	public TrackCreationException(String message) {
		super(message);
	}

}
