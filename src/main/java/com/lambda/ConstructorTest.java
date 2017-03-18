package com.lambda;

public class ConstructorTest {

	public static void main(String[] args) {

		MovieFactory<Movie> movieFactory = Movie::new;

		Movie movie = movieFactory.create("Transporter", 2012);

		System.out.println(movie.getName());
		System.out.println(movie.getYear());
	}

}
