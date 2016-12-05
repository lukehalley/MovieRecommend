package models;

public class User {

	private String userName;
	private int userAge;
	private char userGender;
	private String userOccupation;

	public User(String userName, int userAge, char userGender) {
		this.setUserName(userName);
		this.setUserAge(userAge);
		this.setUserGender(userGender);
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public long getUserAge() {
		return userAge;
	}

	public void setUserAge(int userAge) {
		this.userAge = userAge;
	}

	public char getUserGender() {
		return userGender;
	}

	public void setUserGender(char UserGender) {
		this.userGender = UserGender;
	}

	public String getUserOccupation() {
		return userOccupation;
	}

	public void setUserOccupation(String userOccupation) {
		this.userOccupation = userOccupation;
	}

	@Override
	public String toString() {
		return "USER NAME: '" + this.userName + "', USER AGE: '" + this.userAge + "USER GENDER" + this.userGender + "USER OCCUPATION" + this.userOccupation;
	}

}
