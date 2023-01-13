package com.xworkz.movie.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component

public class CamaraMan {
	
	@Autowired
	private Camara camara;

	public CamaraMan() {

		System.out.println("Running Camaramen Constructor");
	}

	public void camaraMan1() {
		System.out.println("Camara man ===============================================================");
		System.out.println("Camara man  :  " + camara.hashCode());
	}

	public void camaraMan() {
		// TODO Auto-generated method stub
		
	}

}
