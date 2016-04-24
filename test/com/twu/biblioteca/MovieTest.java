package com.twu.biblioteca;


import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MovieTest {
  public Movie movie;
  @Before
  public void initialize() {
    movie = new Movie(1,"movieName", "1989","syn",8);
  }
  @Test
  public void testGetName() {
    assertEquals(movie.getName(), "movieName");
  }

  @Test
  public void testGetYear() {
    assertEquals(movie.getYear(), "1989");
  }
  @Test
  public void testGetDirector() {
    assertEquals(movie.getDirector(), "syn");
  }
  @Test
  public void testGetRate() {
    assertEquals(movie.getRate(), 8);
  }

}

