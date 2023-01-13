package com.xworkz.movie.bean;

import org.springframework.stereotype.Component;

@Component
public class Skill {

    
	public Skill() {
		System.out.println("Running Skill Constructor");

	}

	public void skill() {
		System.out.println("Skill =====================================================");
	}
}
