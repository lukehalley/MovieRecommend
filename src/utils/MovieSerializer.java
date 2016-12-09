package utils;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Map;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

import models.Movie;

public class MovieSerializer {

	static XStream xstream = new XStream(new DomDriver());

	public static void serializeMovies(Map<Long, Movie> movies) {

		String xmlMovies = xstream.toXML(movies);

		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream("serialisedData.xml");
			fos.write("<?xml version=\"1.0\"?>".getBytes("UTF-8"));

			byte[] bytesMovies = xmlMovies.getBytes("UTF-8");

			fos.write(bytesMovies);

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (fos != null) {
				try {
					fos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

	public static String deserializeMovies() {
		String xml = (String) xstream.fromXML("serialisedData.xml");
		return xml;
	}
	
}
