package com.xworkz.movie.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component

public class Producer {
	@Autowired
	private Assistant assistant;

	public Producer() {

		System.out.println("constructor running producer");
	}

	public void producer() {
		System.out.println("Producer ===============================================");
		System.out.println("Producer Hash Code is  : " + assistant.hashCode());
	}

}
