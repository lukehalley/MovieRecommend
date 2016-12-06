package models;

public class Rating {

	private long userID;
	private long movieID;
	private long movieRating;
	private long userTimestamp;

	public Rating(long userID, long movieID, long movieRating, long userTimestamp) {
		this.setUserID(userID);
		this.setmovieRating(movieRating);
		this.setUserTimestamp(userTimestamp);
	}

	public long getUserID() {
		return userID;
	}

	public void setUserID(long userID) {
		this.userID = userID;
	}

	public long getmovieRating() {
		return movieRating;
	}

	public void setmovieRating(long movieRating) {
		this.movieRating = movieRating;
	}
	
	public long getMovieID() {
		return movieID;
	}

	public void setMovieID(long movieID) {
		this.movieID = movieID;
	}

	public long getUserTimestamp() {
		return userTimestamp;
	}

	public void setUserTimestamp(long userTimestamp) {
		this.userTimestamp = userTimestamp;
	}

	@Override
	public String toString() {
		return "USER ID: '" + this.userID + "USER RATING" + this.movieRating + "USER TIMESTAMP" 
							+ this.userTimestamp;
	}

}
