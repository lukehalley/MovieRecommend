package models;

public class Movie {

	private String movieName;
	private long movieReleaseDate;
	private long movieURL;

	public Movie(String movieName, long movieReleaseDate, long movieURL) {
		this.setMovieName(movieName);
		this.setMovieReleaseDate(movieReleaseDate);
		this.setMovieURL(movieURL);
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public long getMovieReleaseDate() {
		return movieReleaseDate;
	}

	public void setMovieReleaseDate(long movieReleaseDate) {
		this.movieReleaseDate = movieReleaseDate;
	}

	public long getMovieURL() {
		return movieURL;
	}

	public void setMovieURL(long movieURL) {
		this.movieURL = movieURL;
	}

	@Override
	public String toString() {
		return "MOVIE NAME: '" + this.movieName + "', MOVIE RELEASE DATE: '" + this.movieReleaseDate + "MOVIE URL"
				+ this.movieURL;
	}

}
