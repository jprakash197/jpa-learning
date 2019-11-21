package com.mindtree.learning.jpalearning.dto;

import java.util.List;

import lombok.Data;

/**
 * @author M1027358 Jyoti Prakash Behera Jun 10, 2019
 */
@Data
public class ResponseTrackDTO<T> {

	private List<T> tracks;

}
