package com.twu.biblioteca;

import com.twu.biblioteca.option.*;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import static com.twu.biblioteca.variable.*;

public class MainMenu {

  private ArrayList<Option> options;
  private static MainMenu menu;

  private MainMenu() {
    this.options = new ArrayList<Option>();
    this.options.add(new ListBookOption());
    this.options.add(new checkoutBookOption());
    this.options.add(new returnBookOption()); 
    this.options.add(new quitOption());
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
      showMenu();
      execOption(validate(getOption(in), in));
    }
  }
}
