package controllers;

import static org.junit.Assert.assertEquals;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

import models.Movie;
import models.Rating;
import models.User;
import utils.FileSerializer;

public class MoviePersistenceTest {

	@Test
	public void testSerializers() {

		Map<Long, Movie> movies = new HashMap<Long, Movie>();
		Movie m = new Movie("test-movie", "2016", "www.google.com");

		Map<Long, User> users = new HashMap<Long, User>();
		User u = new User("Luke", "Halley", "Male", 19, "Student", 2435);

		Map<Long, Rating> ratings = new HashMap<Long, Rating>();
		Rating r = new Rating(1, 2342, 5, 1200);

		movies.put(new Long(m.getId()), m);
		users.put(new Long(u.getId()), u);
		ratings.put(new Long(r.getUserID()), r);

		FileSerializer.serializeFiles(movies, ratings, users);

		Map<Long, Movie> newMovies = new HashMap<Long, Movie>();
		Map<Long, User> newUsers = new HashMap<Long, User>();
		Map<Long, Rating> newRatings = new HashMap<Long, Rating>();
		
		FileSerializer.deserializeFiles(newMovies, newRatings, newUsers);

		assertEquals(movies.size(), newMovies.size());
		assertEquals(users.size(), newUsers.size());
		assertEquals(ratings.size(), newRatings.size());
	}

}