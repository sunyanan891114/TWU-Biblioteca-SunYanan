package com.twu.biblioteca;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class BibliotecaTest {
  public BibliotecaApp bibliotechApp;
  private String welcomeString;
  private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

  @Before
  public void initialize() {
    bibliotechApp = new BibliotecaApp();
    welcomeString = "Welcome to Biblioteca\n";
  }

  @Before
  public void setUpStreams() {
    System.setOut(new PrintStream(outContent));
  }

  @After
  public void cleanUpStreams() {
    System.setOut(null);
  }
  @Test
  public void testWelcome() {
    bibliotechApp.welcome();
    assertEquals(outContent.toString(), welcomeString);
  }
}

