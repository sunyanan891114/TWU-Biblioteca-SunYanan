package com.twu.biblioteca;

import java.util.ArrayList;
import static com.twu.biblioteca.variable.user;

public class UserList {
  private ArrayList<User> list;
  private static UserList userList;

  private UserList() {}

  public static UserList getUserListInstance() {
    if (userList == null) {
      userList = new UserList();
    }
    return userList;
  }

  public boolean hasUser(String library_user, String password) {
    boolean has_user = false;
    for (User u : list)
      if (library_user == u.getLibrary_number() && password == u.getPassword()) {
        has_user = true;
        user = u;
        break;
      }
    return has_user;
  }

}
