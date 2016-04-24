package com.twu.biblioteca.option;

import com.twu.biblioteca.Movie;
import com.twu.biblioteca.Library;

import java.util.Scanner;

public class checkoutMovieOption implements Option{
  public void exec() {
    System.out.print( "Input the movie ID: ");
    Scanner keyboard = new Scanner(System.in);
    int id = keyboard.nextInt();
    boolean check = false;
    for (Movie movie : Library.getLibraryInstance().getMovielist()) {
      if (movie.getId() == id) {
        if (movie.isCheckout()) {
          System.out.println("The movie " + id +" is borrowed. Borrow movie failure!");
        } else {
          movie.setCheckout(true);
          System.out.println("You borrowed the movie " + id + "successfully");
        }
        check = true;
        break;
      }
    }
    if (!check)
      System.out.println("There isn't your movie " + id + ". Please try another ID");
  }
  @Override
  public String toString() {
    return "Borrow a movie.";
  }
}
