package com.twu.biblioteca;

import com.twu.biblioteca.option.ListBookOption;
import com.twu.biblioteca.option.Option;
import com.twu.biblioteca.option.quitOption;

import java.util.ArrayList;

public class BibliotecaApp {

  public static void main(String[] args) {
    Book b = new Book("syn","1989");
    ArrayList<Book> bl = new ArrayList<Book>();
    bl.add(b);
    BookList booklist = BookList.getBookListInstance();
    booklist.setLibrary(bl);

    ArrayList<Option> os = new ArrayList<Option>();
    os.add(new ListBookOption());
    os.add(new quitOption());
    MainMenu mm = new MainMenu(os);
    new BibliotecaApp().welcome();
    booklist.showList();
    mm.start();
  }
  public void welcome() {
    System.out.println("Welcome to Biblioteca");
  }
}
