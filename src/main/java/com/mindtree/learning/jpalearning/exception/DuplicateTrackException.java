package com.mindtree.learning.jpalearning.exception;

/**
 * @author M1027358
 * Jyoti Prakash Behera
 * Jun 10, 2019
 */
public class DuplicateTrackException extends TrackException {

	private static final long serialVersionUID = 1L;

	public DuplicateTrackException() {
	}

	public DuplicateTrackException(String message, Throwable cause) {
		super(message, cause);
	}

	public DuplicateTrackException(String message) {
		super(message);
	}

}
