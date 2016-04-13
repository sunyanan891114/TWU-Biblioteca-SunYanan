package com.twu.biblioteca;

public class Book {
  private String author;
  private String yearPublished;

  public Book(String author, String yearPublished) {
    this.author = author;
    this.yearPublished = yearPublished;
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
}
