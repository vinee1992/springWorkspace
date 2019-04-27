package com.javabrains.resources;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.javabrains.pojo.CatalogItem;
import com.javabrains.pojo.Movie;
import com.javabrains.pojo.Rating;

@RestController
@RequestMapping("/catalog")
public class MovieCatalogServiceResource {

	// get all movie rated ids

	// for each movieId , call movie info service and get details

	// put all them togethr

	@Autowired
	RestTemplate rest;

	@RequestMapping("/{userId}")

	public List<CatalogItem> getCatalogs(@PathVariable String userId) {

		// Movie m=rest.getForObject("http://localhost:8082/movies/1", Movie.class);

		List<Rating> ratings = Arrays.asList(new Rating("1234", 4), new Rating("5678", 5), new Rating("90", 2));

		return ratings.stream().map(r -> {
			Movie m = rest.getForObject("http://localhost:8082/movies/" + r.getMovieId(), Movie.class);
			return new CatalogItem(m.getName(), "test desc", r.getRating());

		}).collect(Collectors.toList());

		// return Collections.singletonList(new CatalogItem("Transformer", "Transformer
		// Test", 2));

	}
}
