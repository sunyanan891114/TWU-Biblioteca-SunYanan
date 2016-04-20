package com.twu.biblioteca.option;

import static com.twu.biblioteca.variable.*;

public class quitOption implements Option{
  @Override
  public void exec() {
    IS_CONTINUE = false;
  }
  @Override
  public String toString() {
    return "Leave.";
  }
}
