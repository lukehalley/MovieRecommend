package models;

import static org.junit.Assert.*;

import org.junit.Test;

public class RatingTest {
	
	Rating test = new Rating(1432, 34523, 5, 1200);
	
	@Test
	public void testCreateMovie() {
		assertEquals(1432, test.userID);
		assertEquals(34523, test.movieID);
		assertEquals(5, test.movieRating);
		assertEquals(1200, test.userTimestamp);
	}
	
	@Test
	public void testGetUserID() {
		assertEquals(1432, test.getUserID());
	}

	@Test
	public void testGetMovieID() {
		assertEquals(34523, test.getMovieID());
	}

	@Test
	public void testMovieRating() {
		assertEquals(5, test.getmovieRating());
	}
	
	@Test
	public void testGetUserTimestamp() {
		assertEquals(1200, test.getUserTimestamp());
	}

}
