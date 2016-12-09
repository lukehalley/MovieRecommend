package controllers;

import asg.cliche.Command;
import asg.cliche.Param;
import asg.cliche.Shell;
import asg.cliche.ShellFactory;

public class Menu {

	public NetfloxAPI netFlox = new NetfloxAPI();

	@Command(description = "Add a new User")
	public void addUser(@Param(name = "first name") String firstName, @Param(name = "last name") String lastName,
			@Param(name = "age") long age, @Param(name = "gender") String gender,
			@Param(name = "occupation") String occupation, @Param(name = "zipCode") long zipCode) {
		netFlox.addUser(firstName, lastName, age, gender, occupation, zipCode);
	}

	@Command(description = "Delete a User")
	public void removeUser(@Param(name = "id") Long id) {
		netFlox.removeUser(id);
	}

	@Command(description = "Add a Movie")
	public void addMovie(@Param(name = "title") String title, @Param(name = "year") String year,
			@Param(name = "url") String url) {
		netFlox.addMovie(title, year, url);
	}

	@Command(description = "Add a Rating")
	public void addRating(@Param(name = "user ID") Long userID, @Param(name = "movie ID") Long movieID,
			@Param(name = "movie rating") Long movieRating, @Param(name = "user timestamp") Long userTimestamp) {
		netFlox.addRating(userID, movieID, movieRating, userTimestamp);
	}

	public static void menu(String[] args) throws Exception {
		Menu menu = new Menu();
		Shell shell = ShellFactory.createConsoleShell("lm", "Welcome to likemovie - ?help for instructions", menu);
		shell.commandLoop();
		menu.netFlox.storeInput();
	}

}
