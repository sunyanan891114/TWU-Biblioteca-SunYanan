package com.twu.biblioteca.option;

import com.twu.biblioteca.UserList;

import java.util.Scanner;

public class LoginOption implements Option {
  public void exec() {
    System.out.println("Please enter you library number: ");
    Scanner keyboard = new Scanner(System.in);
    String library_number = keyboard.next();
    System.out.println("Please enter you password: ");
    String password = keyboard.next();
    if(UserList.getUserListInstance().hasUser(library_number, password))
      System.out.println("Login Successfully");
    else
      System.out.println("Wrong library number or password");
  }
  public String toString() {
    return "Login";
  }
}
