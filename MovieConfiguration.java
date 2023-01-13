package com.xworkz.movie.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.movie")
public class MovieConfiguration {
	
	public MovieConfiguration() {

		System.out.println("configuaration running MovieConfiguration");

	}
	

}
