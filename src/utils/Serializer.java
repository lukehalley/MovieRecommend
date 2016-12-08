package utils;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Map;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

import models.Movie;
import models.Rating;
import models.User;

public class Serializer {
	
	static XStream xstream = new XStream(new DomDriver());
	
	public static void serializeMovies (Map<Long, Movie> movies, Map<Long, Rating> ratings, Map<Long, User> users) {
		
		String xmlMovies = xstream.toXML(movies);
		String xmlRatings = xstream.toXML(ratings);
		String xmlUsers = xstream.toXML(users);
		
		FileOutputStream fos = null;
		try {
		    fos = new FileOutputStream("serialisedMovies");
		    fos.write("<?xml version=\"1.0\"?>".getBytes("UTF-8"));
		    
		    byte[] bytesMovies = xmlMovies.getBytes("UTF-8");
		    byte[] bytesRatings = xmlRatings.getBytes("UTF-8");
		    byte[] bytesUsers = xmlUsers.getBytes("UTF-8");
		    
		    fos.write(bytesMovies);
		    fos.write(bytesRatings);
		    fos.write(bytesUsers);

		} catch(Exception e) {
		    e.printStackTrace();
		} finally {
		    if(fos!=null) {
		        try{ 
		            fos.close();
		        } catch (IOException e) {
		            e.printStackTrace();
		        }
		    }
		}
	}
	
	


}
