package com.xworkz.movie.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component

public class Camara {
	

	@Autowired
	private Lens lens;
	@Autowired
	private Battery battery;
	@Autowired
	private Capacity capacity;

	public Camara() {
		System.out.println("Running Constructor Camara");

	}

	public void LensComara() {
		System.out.println("Camara =================================================");
		System.out.println("Camara Lens Hash code is  : " + lens.hashCode());
		System.out.println("Camara Battery Hash code is   : " + battery.hashCode());
		System.out.println("Capacity hash code is   : " + capacity.hashCode());

	}

}
