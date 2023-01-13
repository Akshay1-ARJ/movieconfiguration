package com.xworkz.movie.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class Assistant {
	
	@Autowired
	private Company company;

	public Assistant() {

		System.out.println("Running constructor Assistant");
	}

	public void companuy() {
		System.out.println("Assistant ==================================================s");
		System.out.println("Company  Hash code is  : " + company);

	}

}
