package com.mindtree.learning.jpalearning.exception.handler;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;

import com.mindtree.learning.jpalearning.exception.DuplicateTrackException;
import com.mindtree.learning.jpalearning.exception.InvalidTrackException;
import com.mindtree.learning.jpalearning.exception.NoTrackFoundException;
import com.mindtree.learning.jpalearning.exception.TrackCreationException;
import com.mindtree.learning.jpalearning.exception.TrackDeletionException;
import com.mindtree.learning.jpalearning.exception.TrackFetchException;
import com.mindtree.learning.jpalearning.exception.TrackUpdationException;

/**
 * @author M1027358 Jyoti Prakash Behera Jun 10, 2019
 */
@RestControllerAdvice
public class TrackExceptionHandler {// extends ResponseEntityExceptionHandler {

	@ExceptionHandler(MethodArgumentNotValidException.class)
	public final ResponseEntity<Object> requestExceptionHandler(MethodArgumentNotValidException ex,
			WebRequest request) {

		final List<FieldError> fieldErrors = ex.getBindingResult().getFieldErrors();
		List<Response> errorResponses = new ArrayList<>();
		fieldErrors.forEach(error -> {
			Response response = new Response();
			response.setMessage(error.getField() + " : " + error.getDefaultMessage());
			response.setHttpStatus(HttpStatus.BAD_REQUEST);
			response.setHttpStatusCode(400);
			response.setError(true);
			errorResponses.add(response);
		});

		return new ResponseEntity<>(errorResponses, HttpStatus.BAD_REQUEST);
	}

	@ExceptionHandler(InvalidTrackException.class)
	public final ResponseEntity<Object> handleInvalidTrackException(InvalidTrackException ex, WebRequest request) {
		Response response = new Response();

		response.setMessage(ex.getMessage());
		response.setHttpStatus(HttpStatus.BAD_REQUEST);
		response.setHttpStatusCode(400);
		response.setError(true);

		return new ResponseEntity<>(response, HttpStatus.BAD_REQUEST);
	}

	@ExceptionHandler(DuplicateTrackException.class)
	@ResponseStatus(value = HttpStatus.BAD_REQUEST)
	public final ResponseEntity<Object> handleDuplicateTrackException(DuplicateTrackException ex, WebRequest request) {
		Response response = new Response();

		response.setMessage(ex.getMessage());
		response.setHttpStatus(HttpStatus.BAD_REQUEST);
		response.setHttpStatusCode(400);
		response.setError(true);

		return new ResponseEntity<Object>(response, HttpStatus.BAD_REQUEST);
	}

	@ExceptionHandler(NoTrackFoundException.class)
	@ResponseStatus(value = HttpStatus.NOT_FOUND)
	public final ResponseEntity<Object> handleNoTrackFoundException(NoTrackFoundException ex, WebRequest request) {
		Response response = new Response();

		response.setMessage(ex.getMessage());
		response.setHttpStatus(HttpStatus.NOT_FOUND);
		response.setHttpStatusCode(404);
		response.setError(true);

		return new ResponseEntity<Object>(response, HttpStatus.NOT_FOUND);
	}

	@ExceptionHandler(TrackFetchException.class)
	@ResponseStatus(value = HttpStatus.EXPECTATION_FAILED)
	public final ResponseEntity<Object> handleTrackFetchException(TrackFetchException ex, WebRequest request) {
		Response response = new Response();

		response.setMessage(ex.getMessage());
		response.setHttpStatus(HttpStatus.EXPECTATION_FAILED);
		response.setHttpStatusCode(417);
		response.setError(true);

		return new ResponseEntity<Object>(response, HttpStatus.EXPECTATION_FAILED);
	}

	@ExceptionHandler(TrackCreationException.class)
	@ResponseStatus(value = HttpStatus.EXPECTATION_FAILED)
	public final ResponseEntity<Object> handleTrackCreationException(TrackCreationException ex, WebRequest request) {
		Response response = new Response();

		response.setMessage(ex.getMessage());
		response.setHttpStatus(HttpStatus.EXPECTATION_FAILED);
		response.setHttpStatusCode(417);
		response.setError(true);

		return new ResponseEntity<Object>(response, HttpStatus.EXPECTATION_FAILED);
	}

	@ExceptionHandler(TrackUpdationException.class)
	@ResponseStatus(value = HttpStatus.EXPECTATION_FAILED)
	public final ResponseEntity<Object> handleTrackUpdationException(TrackUpdationException ex, WebRequest request) {
		Response response = new Response();

		response.setMessage(ex.getMessage());
		response.setHttpStatus(HttpStatus.EXPECTATION_FAILED);
		response.setHttpStatusCode(417);
		response.setError(true);

		return new ResponseEntity<Object>(response, HttpStatus.EXPECTATION_FAILED);
	}

	@ExceptionHandler(TrackDeletionException.class)
	@ResponseStatus(value = HttpStatus.EXPECTATION_FAILED)
	public final ResponseEntity<Object> handleTrackDeletionException(TrackDeletionException ex, WebRequest request) {
		Response response = new Response();

		response.setMessage(ex.getMessage());
		response.setHttpStatus(HttpStatus.EXPECTATION_FAILED);
		response.setHttpStatusCode(417);
		response.setError(true);

		return new ResponseEntity<Object>(response, HttpStatus.EXPECTATION_FAILED);
	}
}
