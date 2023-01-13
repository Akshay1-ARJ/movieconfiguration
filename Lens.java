package com.xworkz.movie.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Lens {
	
	@Autowired
	private Battery battery;

	public Lens() {
		System.out.println("Constructor rnning Lens");

	}

	public void lensBattery() {

		System.out.println("Lens ====================================================");
		System.out.println("Lens Battery  Hash Code  :" + battery.hashCode());
	}
	
	

}
