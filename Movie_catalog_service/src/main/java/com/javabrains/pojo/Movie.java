package com.javabrains.pojo;

public class Movie {

	private String movieId;
	private String name;
	public Movie() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getMovieId() {
		return movieId;
	}
	public void setMovieId(String movieId) {
		this.movieId = movieId;
	}
	public Movie(String movieId, String name) {
		super();
		this.movieId = movieId;
		this.name = name;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
