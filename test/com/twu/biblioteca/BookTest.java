package com.twu.biblioteca;


import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {
  public Book book;
  @Before
  public void initialize() {
    book = new Book();
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

