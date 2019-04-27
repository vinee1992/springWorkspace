package com.javabrains.pojo;

public class Rating {

	public String getMovieId() {
		return movieId;
	}

	public void setMovieId(String movieId) {
		this.movieId = movieId;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public Rating(String movieId, int rating) {
		super();
		this.movieId = movieId;
		this.rating = rating;
	}

	private String movieId;
	private int rating;

	public Rating() {
		super();
		// TODO Auto-generated constructor stub
	}

}
