package com.twu.biblioteca;

import java.util.ArrayList;

public class BibliotecaApp {

  public static void main(String[] args) {
    Book b = new Book("syn","1989",1);
    ArrayList<Book> bl = new ArrayList<Book>();
    bl.add(b);
    Library booklist = Library.getBookListInstance();
    booklist.setBooklist(bl);


    new BibliotecaApp().welcome();
    booklist.showList();
    MainMenu.getMainMenuInstance().start();
  }
  public void welcome() {
    System.out.println("Welcome to Biblioteca");
  }
}
