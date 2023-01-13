package com.xworkz.movie.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Movie {
	
	@Autowired
	private Director director;
	@Autowired
	private Producer producer;

	public Movie() {

		System.out.println("Running Movie Constructor");

	}

	public void Moviedisplay() {
		System.out.println("Movie Display =====================================");
		System.out.println("Director Hash Code is   : " + director.hashCode());
		System.out.println("Producer Hash Code is   : " + producer.hashCode());

	}
	

}
