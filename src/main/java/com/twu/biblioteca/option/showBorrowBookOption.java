package com.twu.biblioteca.option;

import com.twu.biblioteca.Book;
import com.twu.biblioteca.Library;

import static com.twu.biblioteca.variable.user;

public class showBorrowBookOption implements Option {
  public void exec() {
    System.out.printf(" %5s | %16s \n","index",  "Check out user");
    for (Book book: Library.getLibraryInstance().getBooklist()) {
      if (book.isCheckout()) {
        System.out.printf(" %5s | %16s \n",book.getId(), user.getLibrary_number());
      }
    }
  }
}
