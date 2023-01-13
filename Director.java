package com.xworkz.movie.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Director {
	
	
		@Autowired
		private Exprience exprience;
		@Autowired
		private CamaraMan camaraMan;

		public Director() {

			System.out.println("Director Constructor is Running");
		}

		public void director() {
			System.out.println("Director ==================================================");
			System.out.println("Experience hashcode is  : " + exprience.hashCode());
			System.out.println("Skill  hash code is  :  " + camaraMan.hashCode());

		}
}

