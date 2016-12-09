package utils;

import java.util.Map;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

import models.Movie;
import models.Rating;
import models.User;

public class MovieSerializer {

	static XStream xstream = new XStream(new DomDriver());

	public static void serializeMovies(Map<Long, Movie> movies, Map<Long, Rating> ratings, Map<Long, User> users) {

		XMLSerializer.push(movies);
		XMLSerializer.push(users);
		XMLSerializer.push(ratings);

	}

	public static String deserializeMovies(Map<Long, Movie> movies, Map<Long, Rating> ratings, Map<Long, User> users) {
		
		XMLSerializer.pop(movies, ratings, users);
		XMLSerializer.pop(movies, ratings, users);
		XMLSerializer.pop(movies, ratings, users);
		
		
		String xml = (String) xstream.fromXML("serialisedData.xml");
		return xml;
	}

}
