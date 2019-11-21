package com.mindtree.learning.jpalearning.exception.handler;

import java.util.List;

import lombok.Data;

/**
 * Response DTO for Track allotment application.
 * 
 * @author M1027358 Jyoti Prakash Behera Jun 10, 2019
 */
@Data
public class Response {
	/**
	 * The response message.
	 */
	private String message;
	/**
	 * Http status.
	 */
	private Object httpStatus;
	//private List<T> tracks;
	private int httpStatusCode;
	private boolean success;
	private boolean error;
}
