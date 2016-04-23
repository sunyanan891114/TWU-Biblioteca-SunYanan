package com.twu.biblioteca;

import java.util.ArrayList;

public class Library {
  private ArrayList<Book> booklist;
  private static Library library;

  private Library() {}

  public static Library getBookListInstance() {
    if (library == null) {
      library = new Library();
    }
    return library;
  }

  public ArrayList<Book> getLibarary() {
    return this.booklist;
  }

  public void setBooklist(ArrayList<Book> booklist) {
    this.booklist = booklist;
  }

  public void showList() {
    System.out.printf(" %8s |%16s \n", "AUTHOR", "PUBLISHED YEAR");
    for (Book book : this.booklist) {
      if (!book.isCheckout())
        System.out.printf(" %8s |%16s \n", book.getAuthor(), book.getYearPublished());
    }
  }
}
