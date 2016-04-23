package com.twu.biblioteca.option;

import com.twu.biblioteca.Book;
import com.twu.biblioteca.Library;

import java.util.Scanner;

public class returnBookOption implements Option{
  public void exec() {
    System.out.print( "Input the Book ID: ");
    Scanner keyboard = new Scanner(System.in);
    int id = keyboard.nextInt();
    boolean check = false;
    for (Book book : Library.getBookListInstance().getLibarary()) {
      if (book.getId() == id) {
        if ( !book.isCheckout()) {
          System.out.println("The book " + id +" isn't borrowed. Return book failure!");
        } else {
          book.setCheckout(false);
          System.out.println("You return the Book " + id + " successfully");
        }
        check = true;
        break;
      }
    }
    if (!check)
      System.out.println("There isn't a book " + id + ". Please try another ID");
  }
  @Override
  public String toString() {
    return "Return a book.";
  }
}
