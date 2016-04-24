package com.twu.biblioteca;


public class Movie {
  private int id;
  private String name;
  private String year;
  private String director;
  private int rate;
  private boolean checkout;

  public Movie(int id, String name, String year, String director, int rate) {
    this.id = id;
    this.name = name;
    this.year = year;
    this.director = director;
    this.rate = rate;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getYear() {
    return year;
  }

  public void setYear(String year) {
    this.year = year;
  }

  public String getDirector() {
    return director;
  }

  public void setDirector(String director) {
    this.director = director;
  }

  public int getRate() {
    return rate;
  }

  public void setRate(int rate) {
    this.rate = rate;
  }

  public boolean isCheckout() {
    return checkout;
  }

  public void setCheckout(boolean checkout) {
    this.checkout = checkout;
  }

  @Override
  public String toString() {
    return String.format(" %5s | %8s |%16s \n",this.getId(), this.getName(), this.getDirector());
  }
}
