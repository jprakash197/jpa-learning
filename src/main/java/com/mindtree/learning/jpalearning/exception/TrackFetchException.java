package com.mindtree.learning.jpalearning.exception;

/**
 * @author M1027358 Jyoti Prakash Behera Jun 10, 2019
 */
public class TrackFetchException extends TrackException {
	private static final long serialVersionUID = 1L;

	public TrackFetchException() {
	}

	public TrackFetchException(String message, Throwable cause) {
		super(message, cause);
	}

	public TrackFetchException(String message) {
		super(message);
	}

}
