package com.xworkz.movie.boot;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.movie.bean.Assistant;
import com.xworkz.movie.bean.Camara;
import com.xworkz.movie.bean.CamaraMan;
import com.xworkz.movie.bean.Company;
import com.xworkz.movie.bean.Director;
import com.xworkz.movie.bean.Exprience;
import com.xworkz.movie.bean.Location;
import com.xworkz.movie.bean.Movie;
import com.xworkz.movie.configuration.MovieConfiguration;

public class MovieRunner {
	
	public static void main(String[] args) {

		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MovieConfiguration.class);

		System.out.println(Arrays.toString(applicationContext.getBeanDefinitionNames()));

		Movie movie = applicationContext.getBean(Movie.class);
		movie.Moviedisplay();
		Director director = applicationContext.getBean(Director.class);
		director.director();
		Exprience exprience = applicationContext.getBean(Exprience.class);
		exprience.Experience();

		CamaraMan camaraMan = applicationContext.getBean(CamaraMan.class);
		camaraMan.camaraMan();
		Camara camara = applicationContext.getBean(Camara.class);
		camara.LensComara();
		Assistant assistant = applicationContext.getBean(Assistant.class);
		assistant.companuy();
		Company company = applicationContext.getBean(Company.class);
		company.company();
		Location location = applicationContext.getBean(Location.class);
		location.location();

	}


}
