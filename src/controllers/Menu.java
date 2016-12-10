package controllers;

import asg.cliche.Command;
import asg.cliche.Param;
import asg.cliche.Shell;
import asg.cliche.ShellFactory;

public class Menu {

	public NetfloxAPI netFlox = new NetfloxAPI();

	@Command(description = "Add A New User")
	public void addUser(@Param(name = "first name") String firstName, @Param(name = "last name") String lastName,
			@Param(name = "age") long age, @Param(name = "gender") String gender,
			@Param(name = "occupation") String occupation, @Param(name = "zipCode") long zipCode) {
		netFlox.addUser(firstName, lastName, age, gender, occupation, zipCode);
	}

	@Command(description = "Delete A User")
	public void removeUser(@Param(name = "id") Long id) {
		netFlox.removeUser(id);
	}

	@Command(description = "Add A Movie")
	public void addMovie(@Param(name = "title") String title, @Param(name = "year") String year,
			@Param(name = "url") String url) {
		netFlox.addMovie(title, year, url);
	}

	@Command(description = "Add a Rating")
	public void addRating(@Param(name = "user ID") Long userID, @Param(name = "movie ID") Long movieID,
			@Param(name = "movie rating") Long movieRating, @Param(name = "user timestamp") Long userTimestamp) {
		netFlox.addRating(userID, movieID, movieRating, userTimestamp);
	}
	
	@Command(description = "Get A Movie")
	public void getMovie(@Param(name = "movie ID") Long id) {
		netFlox.getMovie(id);
	}
	
	@Command(description = "Get A Users Ratings")
	public void getUserRatings(@Param(name = "user ID") Long userID) {
		netFlox.getUserRatings(userID);
	}
	
	@Command(description = "Top 10 Movies")
	public void getTop10Movies() {
		netFlox.getTop10Movies();
	}

	public void menu() throws Exception {
		Menu menu = new Menu();
		Shell shell = ShellFactory.createConsoleShell("lm", "Welcome to likemovie - ?help for instructions", menu);
		shell.commandLoop();
		menu.netFlox.storeInput();
	}

}
