package com.twu.biblioteca;

import com.twu.biblioteca.option.*;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Scanner;

import static com.twu.biblioteca.variable.*;
import static com.twu.biblioteca.variable.user;

public class MainMenu {

  private ArrayList<Option> options;
  private static MainMenu menu;

  private final Option loginOption = new LoginOption();
  private final Option listBookOption = new ListBookOption();
  private final Option checkoutBookOption = new checkoutBookOption();
  private final Option returnBookOption = new returnBookOption();
  private final Option checkoutMovieOption = new checkoutMovieOption();
  private final Option returnMovieOption = new returnMovieOption();
  private final Option quitOption = new quitOption();
  private final Option userAccountOption = new userAccountOption();
  private final Option showBorrowBookOption = new showBorrowBookOption();



  private MainMenu() {
    this.options = new ArrayList<Option>();
    this.options.add(loginOption);
    this.options.add(listBookOption);
    this.options.add(quitOption);
  }

  public static MainMenu getMainMenuInstance() {
    if (menu == null) {
      menu = new MainMenu();
    }
    return menu;
  }

  public void showMenu() {
    System.out.println("-------------------------------");
    System.out.println("MainMenu:");
    System.out.println("-------------------------------");

    for (int i = 0; i < options.size(); i++) {
      System.out.println(i + " " + options.get(i));
    }
    System.out.println("-------------------------------");
    System.out.println("You can get the function by typing numbers");
    System.out.print("Select an option: ");
  }

  public int getOption(InputStream in) {
    Scanner keyboard = new Scanner(in);
    int option_index;
    try{
      option_index = keyboard.nextInt();
    } catch (InputMismatchException e) {
      return -1;
    }
    return option_index;
  }


  public int validate(int option_index, InputStream in) {
    while (option_index >= options.size() || option_index < 0) {
      System.out.print("Please enter a valid option:");
      option_index = getOption(in);
    }
    return option_index;
  }

  public void execOption(int option_index) {
    if (option_index >= 0) {
      this.options.get(option_index).exec();
    }
  }

  public void start() {
    InputStream in = System.in;
    while (IS_CONTINUE) {
      if (user != null && options.size() < 3) {
        options.add(checkoutBookOption);
        options.add(returnBookOption);
        options.add(checkoutMovieOption);
        options.add(returnMovieOption);
        options.add(userAccountOption);
        if (user.isAdmin()) {
          options.add(showBorrowBookOption);
        }
      }
      showMenu();
      execOption(validate(getOption(in), in));
    }
  }
}
