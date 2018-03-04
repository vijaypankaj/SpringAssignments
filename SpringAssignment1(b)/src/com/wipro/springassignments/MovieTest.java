package com.wipro.springassignments;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MovieTest {

	public static void main(String[] args) {

		ApplicationContext ctx = 
		         new AnnotationConfigApplicationContext(MovieConfig.class);
		
		Movie movieObject=ctx.getBean(Movie.class);
		movieObject.setMovieId("M001");
movieObject.setMovieName("Gabbar is Back");
movieObject.setMovieActor("Akshay Kumar");
System.out.println("MovieId:"+movieObject.getMovieId()+"\nMovieName:"+movieObject.getMovieName()+"\nMovieActor:"+movieObject.getMovieActor());
	}

}
