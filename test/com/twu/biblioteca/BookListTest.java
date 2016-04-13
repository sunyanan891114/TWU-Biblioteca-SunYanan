package com.twu.biblioteca;


import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;
import static org.junit.Assert.assertEquals;

public class BookListTest {
  public static BookList bookList;
  public ArrayList<Book> booklist;
  @Before
  public void initialize() {
    bookList = BookList.getBookListInstance();
    booklist = new ArrayList<Book>();
  }
//  @Test
//  public void testShowList() {
////    assertEquals(bookList.showList(), booklist);
//  }
}

