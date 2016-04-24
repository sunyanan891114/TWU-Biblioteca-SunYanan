package com.twu.biblioteca.option;

import com.twu.biblioteca.Book;
import com.twu.biblioteca.Library;

import java.util.Scanner;

public class checkoutBookOption implements Option{
  public void exec() {
    System.out.print( "Input the Book ID: ");
    Scanner keyboard = new Scanner(System.in);
    int id = keyboard.nextInt();
    boolean check = false;
    for (Book book : Library.getBookListInstance().getBooklist()) {
      if (book.getId() == id) {
        if (book.isCheckout()) {
          System.out.println("The book " + id +" is borrowed. Borrow book failure!");
        } else {
          book.setCheckout(true);
          System.out.println("You borrowed the Book " + id + "successfully");
        }
        check = true;
        break;
      }
    }
    if (!check)
      System.out.println("There isn't your book " + id + ". Please try another ID");
  }
  @Override
  public String toString() {
    return "Borrow a book.";
  }
}
