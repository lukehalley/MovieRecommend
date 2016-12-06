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

//	public String toString() {
//		return new ToJsonString(getClass(), this).toString();
//	}
//
//	@Override
//	public int hashCode() {
//		return Objects.hashCode(this.id, this.firstName, this.lastName, this.gender, this.age, this.occupation, this.zipCode);
//	}
//
//	@Override
//	public boolean equals(final Object obj) {
//		if (obj instanceof User) {
//			final User other = (User) obj;
//			return Objects.equal(firstName, other.firstName) && Objects.equal(lastName, other.lastName)
//					&& Objects.equal(gender, other.gender) && Objects.equal(age, other.age)
//					&& Objects.equal(occupation, other.occupation) && Objects.equal(ratings, other.ratings);
//		} else {
//			return false;
//		}
//	}

}
