package com.twu.biblioteca;

import com.twu.biblioteca.option.Option;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import static com.twu.biblioteca.variable.*;

public class MainMenu {

  private ArrayList<Option> options;

  public MainMenu(ArrayList<Option> options) {
    this.options = options;
  }

  public void showMenu() {
    System.out.println("MainMenu:");
    System.out.println("-------------------------------");
    for (int i = 0; i < options.size(); i++) {
      System.out.println(i + " " + options.get(i));
    }
    System.out.println("-------------------------------");
    System.out.println("You can get the function by typing numbers");
    System.out.println("Select an option: ");
  }

  public int getOption() {
    Scanner keyboard = new Scanner(System.in);
    int option_index;
    try{
      option_index = keyboard.nextInt();
    } catch (InputMismatchException e) {
      return -1;
    }
    return option_index;
  }


  public int validate(int option_index) {
    while (option_index >= options.size() || option_index < 0) {
      System.out.println("Please enter a valid option:");
      option_index = getOption();
    }
    return option_index;
  }

  public void execOption(int option_index) {
    if (option_index >= 0) {
      this.options.get(option_index).exec();
    }
  }

  public void start() {
    while (IS_CONTINUE) {
      showMenu();
      execOption(validate(getOption()));
    }
  }
}
