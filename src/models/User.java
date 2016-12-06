package models;

import java.util.ArrayList;
import java.util.List;

public class User {

	static Long counter = 0l;
	public Long id;
	public String firstName;
	public String lastName;
	public String gender;
	public long age;
	public String occupation;
	public long zipCode;

	public List<Rating> ratings = new ArrayList<>();

	public User(String firstName, String lastName, String gender, long age, String occupation, long zipCode) {
		this.id = counter++;
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.age = age;
		this.occupation = occupation;
		this.zipCode = zipCode;
	}

}
