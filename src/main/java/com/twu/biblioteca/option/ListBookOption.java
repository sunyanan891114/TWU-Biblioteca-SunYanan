package com.twu.biblioteca.option;

import com.twu.biblioteca.Library;

public class ListBookOption implements Option{
  public void exec() {
    Library.getLibraryInstance().showList();
  }
  @Override
  public String toString() {
    return "List books haven't been borrowed.";
  }
}
