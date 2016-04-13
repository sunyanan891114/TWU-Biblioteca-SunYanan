package com.twu.biblioteca.option;

import com.twu.biblioteca.BookList;

public class ListBookOption implements Option{
  @Override
  public void exec() {
    BookList.getBookListInstance().showList();
  }
  @Override
  public String toString() {
    return "List books haven't been borrowed.";
  }
}
