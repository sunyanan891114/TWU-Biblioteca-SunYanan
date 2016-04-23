package com.twu.biblioteca;


import org.junit.Before;

import java.util.ArrayList;
import static org.junit.Assert.assertEquals;

public class LibraryTest {
  public static Library bookList;
  public ArrayList<Book> booklist;
  @Before
  public void initialize() {
    bookList = Library.getBookListInstance();
    booklist = new ArrayList<Book>();
  }
//  @Test
//  public void testShowList() {
////    assertEquals(bookList.showList(), booklist);
//  }
}

