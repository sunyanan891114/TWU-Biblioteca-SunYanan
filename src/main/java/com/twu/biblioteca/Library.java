package com.twu.biblioteca;

import java.util.ArrayList;

public class Library {
  private ArrayList<Book> booklist;
  private ArrayList<Movie> movielist;
  private static Library library;

  private Library() {}

  public static Library getBookListInstance() {
    if (library == null) {
      library = new Library();
    }
    return library;
  }

  public ArrayList<Book> getBooklist() {
    return this.booklist;
  }

  public void setBooklist(ArrayList<Book> booklist) {
    this.booklist = booklist;
  }

  public ArrayList<Movie> getMovielist() {
    return movielist;
  }

  public void setMovielist(ArrayList<Movie> movielist) {
    this.movielist = movielist;
  }

  public static Library getLibrary() {
    return library;
  }

  public static void setLibrary(Library library) {
    Library.library = library;
  }

  public void showList() {
    System.out.println("Books in the Library");
    System.out.printf(" %5s | %8s |%16s \n","index",  "AUTHOR", "PUBLISHED YEAR");
    for (Book book : this.booklist) {
      if (!book.isCheckout())
        System.out.printf(book.toString());
    }
    System.out.println("Movies in the Library");
    System.out.printf(" %5s | %16s |%16s \n","index",  "Movie Name", "Director");
    for (Movie movie : this.movielist) {
      if (!movie.isCheckout())
        System.out.printf(movie.toString());
    }
  }
}
