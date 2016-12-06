package utils;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import models.Movie;
import models.Rating;
import models.User;

public class Importer {
	
	public static HashMap<Long, User> userMap = new HashMap<Long, User>();
	public static HashMap<Long, Movie> movieMap = new HashMap<Long, Movie>();
	public static ArrayList<Rating> ratingArray = new ArrayList<Rating>();
	public static void ImportUsers() {

		// Scanner
		File usersFile = new File("users5.dat");
		Scanner inUsers;
		try {
			inUsers = new Scanner(usersFile);

			String delims = "\t";
			// each field in the file is separated (delimited) by a space.

			inUsers.nextLine();

			

			while (inUsers.hasNextLine()) {

				String userLine = inUsers.nextLine().trim();
				String[] userTokens = userLine.split(delims);
				
				long userID = Long.parseLong(userTokens[0]);
				String firstName = userTokens[1];
				String lastName = userTokens[2];
				String gender = userTokens[3];
				long age = Long.parseLong(userTokens[4]);
				String occupation = userTokens[5];
				long zipCode = Long.parseLong(userTokens[6]);

				// output user data to console.
				if (userTokens.length == 2) {
					User u = new User(firstName, lastName, gender, age, occupation, zipCode);
					userMap.put(new Long (userID), u);
				} else {
					inUsers.close();
				}

			}

		} catch (FileNotFoundException e) {

			e.printStackTrace();

		}

	}

	public static void ImportMovies() {

		// Scanner
		File moviesFile = new File("items5.txt");
		Scanner inMovies;
		try {
			
			inMovies = new Scanner(moviesFile);

			String delims = "\t";
			// each field in the file is separated (delimited) by a space.

			inMovies.nextLine();

			

			while (inMovies.hasNextLine()) {

				String movieLine = inMovies.nextLine().trim();
				String[] movieTokens = movieLine.split(delims);
				
				long movieID = Long.parseLong(movieTokens[0]);
				String title = movieTokens[1];
				String releaseDate = movieTokens[2];
				String url = movieTokens[3];

				// output movie data to console.
				if (movieTokens.length == 2) {
					Movie m = new Movie(title, releaseDate, url);
					movieMap.put(new Long (movieID), m);
				} else {
					inMovies.close();
				}

			}

		} catch (FileNotFoundException e) {

			e.printStackTrace();

		}

	}
	
	public static void ImportRatings() {

		// Scanner
		File ratingsFile = new File("ratings5.txt");
		Scanner inRatings;
		try {
			
			inRatings = new Scanner(ratingsFile);

			String delims = "\t";
			// each field in the file is separated (delimited) by a space.

			inRatings.nextLine();

			

			while (inRatings.hasNextLine()) {

				String userLine = inRatings.nextLine().trim();
				String[] ratingTokens = userLine.split(delims);

				long userID = Long.parseLong(ratingTokens[0]);
				long movieID = Long.parseLong(ratingTokens[1]);
				long movieRating = Long.parseLong(ratingTokens[2]);
				long userTimestamp = Long.parseLong(ratingTokens[3]);

				// output rating data to console.
				if (ratingTokens.length == 2) {
					Rating r = new Rating(userID, movieID, movieRating, userTimestamp);
					ratingArray.add(r);
					movieMap.get(r.getMovieID()).addRating(r);
				} else {
					inRatings.close();
				}

			}

		} catch (FileNotFoundException e) {

			e.printStackTrace();

		}

	}
}
