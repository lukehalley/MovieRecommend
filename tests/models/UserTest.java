package models;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class UserTest {
	
	User test = new User("Luke", "Halley", "Male", 19, "Student", 3415);
	
	@Test
	public void testCreateMovie() {
		assertEquals("Luke", test.firstName);
		assertEquals("Halley", test.lastName);
		assertEquals("Male", test.gender);
		assertEquals(19, test.age);
		assertEquals("Student", test.occupation);
		assertEquals(3415, test.zipCode);
	}
	
	@Test
	public void testGetFirstName() {
		assertEquals("Luke", test.getFirstName());
	}

	@Test
	public void testGetLastName() {
		assertEquals("Halley", test.getLastName());
	}

	@Test
	public void testGetGender() {
		assertEquals("Male", test.getGender());
	}
	
	@Test
	public void testGetAge() {
		assertEquals(19, test.getAge());
	}
	
	@Test
	public void testGetOccupation() {
		assertEquals("Student", test.getOccupation());
	}
	
	@Test
	public void testGetZipCode() {
		assertEquals(3415, test.getZipCode());
	}

}
