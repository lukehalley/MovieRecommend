package utils;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Map;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

import models.User;

public class UserSerializer {

	static XStream xstream = new XStream(new DomDriver());

	public static void serializeUsers(Map<Long, User> users) {

		String xmlUsers = xstream.toXML(users);

		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream("serialisedData.xml");
			fos.write("<?xml version=\"1.0\"?>".getBytes("UTF-8"));

			byte[] bytesUsers = xmlUsers.getBytes("UTF-8");

			fos.write(bytesUsers);

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

	public static String deserializeUsers() {
		String xml = (String) xstream.fromXML("serialisedData.xml");
		return xml;
	}
	
}
