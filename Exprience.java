package com.xworkz.movie.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Exprience {
	
	@Autowired
	private Skill skill;

	public Exprience() {
		System.out.println("Running Constructor Experince");
	}

	public void Experience() {
		System.out.println("Experience =======================================");
		System.out.println("Experince hashcode is : " + skill.hashCode());
	}

}
