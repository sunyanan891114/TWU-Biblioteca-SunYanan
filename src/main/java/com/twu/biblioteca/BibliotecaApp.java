package com.twu.biblioteca;

import java.util.ArrayList;

public class BibliotecaApp {

  public static void main(String[] args) {
    Book b = new Book("syn","1989",1);
    Movie m = new Movie(1, "movieName", "syn", "1989", 8);
    ArrayList<Book> bl = new ArrayList<Book>();
    bl.add(b);
    ArrayList<Movie> ml = new ArrayList<Movie>();
    ml.add(m);
    Library library = Library.getLibraryInstance();
    library.setBooklist(bl);
    library.setMovielist(ml);

    new BibliotecaApp().welcome();
    library.showList();
    MainMenu.getMainMenuInstance().start();
  }
  public void welcome() {
    System.out.println("Welcome to Biblioteca");
  }
}
