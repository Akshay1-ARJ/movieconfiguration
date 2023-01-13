package com.xworkz.movie.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class Company {

	

		@Autowired
		private Location location;

		public Company() {

			System.out.println("running constructor companuy");
		}

		public void company() {
			System.out.println("Company ======================================================");
			System.out.println("Location Hash code is   :" + location.hashCode());
		}
	}


