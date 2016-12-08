package models;

import static org.junit.Assert.*;

import org.junit.Test;

public class MovieTest {
	
	  Movie test = new Movie ("Elf", "2016", "www.google.com");

	  @Test
	  public void testCreate()
	  {
	    assertEquals ("Elf",                   test.title);
	    assertEquals ("2016",        		   test.releaseDate);
	    assertEquals ("www.google.com",		   test.url);    
	  }
	  
	  @Test
	  public void testGetTitle()
	  {
	    assertEquals ("Elf",                   test.getTitle()); 
	  }
	  
	  @Test
	  public void testGetReleaseDate()
	  {
	    assertEquals ("2016",                  test.getReleaseDate()); 
	  }
	  
	  @Test
	  public void testGetUrl()
	  {
	    assertEquals ("www.google.com",        test.getUrl()); 
	  }

}
