package com.twu.biblioteca.option;

import com.twu.biblioteca.Library;
import com.twu.biblioteca.Movie;

import java.util.Scanner;

public class returnMovieOption implements Option{
  public void exec() {
    System.out.print( "Input the Book ID: ");
    Scanner keyboard = new Scanner(System.in);
    int id = keyboard.nextInt();
    boolean check = false;
    for (Movie movie : Library.getLibraryInstance().getMovielist()) {
      if (movie.getId() == id) {
        if ( !movie.isCheckout()) {
          System.out.println("The movie " + id +" isn't borrowed. Return movie failure!");
        } else {
          movie.setCheckout(false);
          System.out.println("You return the Movie " + id + " successfully");
        }
        check = true;
        break;
      }
    }
    if (!check)
      System.out.println("There isn't a movie " + id + ". Please try another ID");
  }
  @Override
  public String toString() {
    return "Return a Movie.";
  }
}
