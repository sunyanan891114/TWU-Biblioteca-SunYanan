package com.twu.biblioteca;


import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class BibliotecaTest {
  public BibliotecaApp bibliotechApp;
  String welcomeString;
  @Before
  public void initialize() {
    bibliotechApp = new BibliotecaApp();
    welcomeString = "Hello, Welcome to Biblioteca. You can borrow a book";
  }
  @Test
  public void welcomeTest() {
    assertEquals(bibliotechApp.welcome(), welcomeString);
  }
}

