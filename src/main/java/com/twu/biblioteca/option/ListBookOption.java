package com.twu.biblioteca.option;

import com.twu.biblioteca.Library;

public class ListBookOption implements Option{
  @Override
  public void exec() {
    Library.getBookListInstance().showList();
  }
  @Override
  public String toString() {
    return "List books haven't been borrowed.";
  }
}
