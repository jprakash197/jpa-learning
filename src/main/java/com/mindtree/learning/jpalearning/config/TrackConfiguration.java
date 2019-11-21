package com.mindtree.learning.jpalearning.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author M1027358 Jyoti Prakash Behera Jun 10, 2019
 */
@Configuration
public class TrackConfiguration {

	@Bean
	public ModelMapper modelMapper() {
		return new ModelMapper();
	}

}
