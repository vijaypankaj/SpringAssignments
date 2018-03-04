package com.wipro.springassignments;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MovieConfig {

	@Bean
	public Movie movieClass(){
		
		return new Movie();
	}
}
