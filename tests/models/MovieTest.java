package models;

import static org.junit.Assert.*;

import org.junit.Test;

public class MovieTest {

	Movie test = new Movie("Elf", "2016", "www.google.com");

	@Test
	public void testCreateMovie() {
		assertEquals("Elf", test.title);
		assertEquals("2016", test.releaseDate);
		assertEquals("www.google.com", test.url);
	}

	@Test
	public void testGetTitle() {
		assertEquals("Elf", test.getTitle());
	}

	@Test
	public void testGetReleaseDate() {
		assertEquals("2016", test.getReleaseDate());
	}

	@Test
	public void testGetUrl() {
		assertEquals("www.google.com", test.getUrl());
	}

	@Test
	public void testCalculateAverageRating() {
		
		test.addRating(new Rating(-1, -1, 5, -1));
		assertEquals(5.0, test.calculateAverageRating(), 0.001);
		
	}
}
