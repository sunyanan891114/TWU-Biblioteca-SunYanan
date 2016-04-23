package com.twu.biblioteca;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import static org.junit.Assert.assertEquals;

public class LibraryTest {
  public static Library library;
  public ArrayList<Book> booklist;
  private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
  @Before
  public void initialize() {
    library = Library.getBookListInstance();
    booklist = new ArrayList<Book>();
    booklist.add(new Book("syn","1989",1));
    library.setBooklist(booklist);
  }
  @Before
  public void setUpStreams() {
    System.setOut(new PrintStream(outContent));
  }

  @After
  public void cleanUpStreams() {
    System.setOut(null);
  }
  @Test
  public void testShowList() {
    library.showList();
    String test = "   AUTHOR |  PUBLISHED YEAR \n" + "      syn |            1989 \n";
    assertEquals(outContent.toString(), test);
  }
}

