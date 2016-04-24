package com.twu.biblioteca;

public class Book {
  private String author;
  private String yearPublished;
  private int id;
  private String userName;

  private boolean checkout = false;

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public Book(String author, String yearPublished, int id) {
    this.author = author;
    this.yearPublished = yearPublished;
    this.id = id;
  }

  public boolean isCheckout() {
    return checkout;
  }
  public void setCheckout(boolean checkout) {
    this.checkout = checkout;
  }
  public String getYearPublished() {
    return yearPublished;
  }
  public void setYearPublished(String yearPublished) {
    this.yearPublished = yearPublished;
  }
  public String getAuthor() {
    return author;
  }
  public void setAuthor(String author) {
    this.author = author;
  }

  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  @Override
  public String toString() {
    return String.format(" %5s | %8s |%16s \n",this.getId(), this.getAuthor(), this.getYearPublished());
  }
}
