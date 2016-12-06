package models;

import java.util.ArrayList;
import java.util.List;

public class Movie {
	
	static Long counter = 0l;
	public Long id;
	public String title;
	public String releaseDate;
	public String url;

	List<Rating> ratings = new ArrayList<Rating>();
	
	public Movie(String title, String releaseDate, String url) {
		this.id = counter++;
		this.title = title;
		this.releaseDate = releaseDate;
		this.url = url;
	}

	public void addRating(Rating newRating) {
		ratings.add(newRating);
	}

	@SuppressWarnings("unused")
	private double calculateAverageRating(List<Long> ratings) {
		int sum = 0;
		if (!ratings.isEmpty()) {
			for (Long rating : ratings) {
				sum += rating;
			}
			return (double) sum / ratings.size();
		}

		return sum;
	}
	
	
}