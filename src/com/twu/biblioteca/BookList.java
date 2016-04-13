package com.twu.biblioteca;

import java.util.ArrayList;

public class BookList {
  private ArrayList<Book> library;
  private static BookList booklist;

  private BookList() {}

  public static BookList getBookListInstance() {
    if (booklist == null) {
      booklist = new BookList();
    }
    return booklist;
  }

  public ArrayList<Book> getLibarary() {
    return this.library;
  }

  public void setLibrary(ArrayList<Book> library) {
    this.library = library;
  }

  public void showList() {
    System.out.printf(" %8s |%16s \n", "AUTHOR", "PUBLISHED YEAR");
    for (Book book : this.library) {
      System.out.printf(" %8s |%16s \n", book.getAuthor(), book.getYearPublished());
    }
  }
}
