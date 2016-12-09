package controllers;

import static org.junit.Assert.assertEquals;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

import models.Movie;
import utils.MovieSerializer;

public class MoviePersistenceTest {
	
	@Test
	public void testSerializers() {
		
		Map<Long, Movie> movies = new HashMap<Long, Movie>();
		Movie m = new Movie ("test-movie", "2016", "www.google.com");
		movies.put(new Long(m.getId()), m);
		
		MovieSerializer.serializeMovies(movies);
		
		Map<Long, Movie> newMovies = MovieSerializer.deserializeMovies()
		MovieSerializer.deserializeMovies(movies);
		
		assertEquals(movies.size(), newMovies.size());
	}

}
