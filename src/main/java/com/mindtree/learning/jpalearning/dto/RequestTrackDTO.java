package com.mindtree.learning.jpalearning.dto;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Data;

/**
 * @author M1027358 Jyoti Prakash Behera Jun 10, 2019
 */
@Data
public class RequestTrackDTO {

	@NotBlank
	@Size(min = 2, max = 20)
	private String name;

	@NotNull
	@Min(value=2)
	@Max(value=10)
	private int leadCount;
	
	private int campusMindCount;

}
