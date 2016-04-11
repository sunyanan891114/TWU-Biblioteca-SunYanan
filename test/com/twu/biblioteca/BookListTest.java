package com.twu.biblioteca;


import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;
import static org.junit.Assert.assertEquals;

public class BookListTest {
  public BookList bookList;
  public ArrayList<Book> booklist;
  @Before
  public void initialize() {
    bookList = new BookList();
    booklist = new ArrayList<Book>();
  }
  @Test
  public void testShowList() {
    assertEquals(bookList.showList(), booklist);
  }
}

