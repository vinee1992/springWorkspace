package com.javabrains.RatingResource;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javabrains.Pojo.Rating;

@RestController
@RequestMapping("/ratingsdata")
public class RatingResource {

	@RequestMapping("/{movieId}")
	public Rating rating(@PathVariable String movieId) {

		return new Rating("Transformer", 4);
	}

	@RequestMapping("/users/{userId}")
	public List<Rating> getUserRating(@PathVariable String movieId) {

		return Arrays.asList(new Rating("1234", 4), new Rating("5678", 5), new Rating("90", 2));
	}

}
