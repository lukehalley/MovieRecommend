package models;

public class Rating {

	private long userID;
	private int userAge;
	private long userRating;
	private long userTimestamp;
	private char userGender;

	public Rating(long userID, int userAge, long userRating, long userTimestamp, char userGender) {
		this.setUserID(userID);
		this.setUserAge(userAge);
		this.setUserRating(userRating);
		this.setUserTimestamp(userTimestamp);
		this.setUserGender(userGender);
	}

	public long getUserID() {
		return userID;
	}

	public void setUserID(long userID) {
		this.userID = userID;
	}

	public int getUserAge(int userAge) {
		return userAge;
	}

	public void setUserAge(int userAge) {
		this.userAge = userAge;
	}

	public long getUserRating() {
		return userRating;
	}

	public void setUserRating(long userRating) {
		this.userRating = userRating;
	}

	public long getUserTimestamp() {
		return userTimestamp;
	}

	public void setUserTimestamp(long userTimestamp) {
		this.userTimestamp = userTimestamp;
	}
	
	public long getUserGender() {
		return userGender;
	}

	public void setUserGender(char userGender) {
		this.userGender = userGender;
	}

	@Override
	public String toString() {
		return "USER ID: '" + this.userID + "', USER AGE: '" + this.userAge + "USER RATING" + this.userRating + "USER TIMESTAMP" + this.userTimestamp + "USER GENDER" + this.userGender;
	}

}
