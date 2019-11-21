package com.mindtree.learning.jpalearning.exception;

/**
 * @author M1027358 Jyoti Prakash Behera Jun 10, 2019
 */
public class InvalidTrackException extends TrackException {

	private static final long serialVersionUID = 1L;

	public InvalidTrackException() {
	}

	public InvalidTrackException(String message, Throwable cause) {
		super(message, cause);
	}

	public InvalidTrackException(String message) {
		super(message);
	}

}
