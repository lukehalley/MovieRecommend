package controllers;

import java.util.List;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import models.Movie;
import models.Rating;
import models.User;
import utils.FileSerializer;

public class NetfloxAPI {

	public Map<Long, User> userIndex = new HashMap<>();
	public Map<Long, Movie> movieIndex = new HashMap<>();
	public Map<Long, Rating> ratingIndex = new HashMap<>();

	public User addUser(String firstName, String lastName, long age, String gender, String occupation, long zipCode) {
		User user = new User(firstName, lastName, gender, age, occupation, zipCode);
		userIndex.put(user.id, user);
		return user;
	}

	public Movie addMovie(String title, String year, String url) {
		Movie movie = new Movie(title, year, url);
		movieIndex.put(movie.id, movie);
		return movie;
	}

	public Rating addRating(long userID, long movieID, long movieRating, long userTimestamp) {
		Rating rating = new Rating(userID, movieID, movieRating, userTimestamp);
		ratingIndex.put(rating.getUserID(), rating);
		return rating;
	}

	public User removeUser(long id) {
		return userIndex.remove(id);
	}

	public Movie getMovie(long id) {
		return movieIndex.get(id);
	}

	public Rating getUserRatings(long userID) {
		return ratingIndex.get(userID);
	}

	public List<Movie> getTop10Movies() {
		List<Movie> tenMovies = (List<Movie>) movieIndex.values();
		Collections.sort(tenMovies);
		return tenMovies.subList(1, 10);
	}
	
	public List<Movie> getUserRecommendations(long userID) {
		List<Movie> recMovies = (List<Movie>) movieIndex.values();
		Collections.sort(recMovies);
		//Go through the list and if the user hasnt rated it add it to the sublist
		return recMovies.subList(1, 5);
	}

	public void storeInput() {
		FileSerializer.serializeFiles(movieIndex, ratingIndex, userIndex);
	}

}
