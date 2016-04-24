package com.twu.biblioteca.option;

import com.twu.biblioteca.UserList;

public class userAccountOption implements Option {

  public void exec() {
    System.out.println(UserList.getUserListInstance().getUser().toString());
  }
}
