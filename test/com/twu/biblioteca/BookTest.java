package com.twu.biblioteca;


import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {
  public Book book;
  @Before
  public void initialize() {
    book = new Book("syn", "1989");
  }
  @Test
  public void testGetAuthor() {
    assertEquals(book.getAuthor(), "syn");
  }

  @Test
  public void testGetYearPublished() {
    assertEquals(book.getYearPublished(), "1989");
  }
}

