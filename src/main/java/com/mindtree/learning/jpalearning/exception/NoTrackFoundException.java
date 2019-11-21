package com.mindtree.learning.jpalearning.exception;

/**
 * @author M1027358 Jyoti Prakash Behera Jun 10, 2019
 */
public class NoTrackFoundException extends TrackException {

	private static final long serialVersionUID = 1L;

	public NoTrackFoundException() {
	}

	public NoTrackFoundException(String message, Throwable cause) {
		super(message, cause);
	}

	public NoTrackFoundException(String message) {
		super(message);
	}

}
