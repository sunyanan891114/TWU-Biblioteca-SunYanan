package com.twu.biblioteca;


import com.twu.biblioteca.option.checkoutBookOption;
import org.easymock.EasyMockSupport;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static com.twu.biblioteca.MainMenu.getMainMenuInstance;
import static org.junit.Assert.assertEquals;


public class MainMenuTest extends EasyMockSupport{
  public MainMenu mainMenu;

  private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
  @Before
  public void setUpStreams() {
    System.setOut(new PrintStream(outContent));
  }
  @Test
  public void testShowMenu() {
    getMainMenuInstance().showMenu();
    String menu = "-------------------------------\n" +
      "MainMenu:\n" +
      "-------------------------------\n" +
      "0 List books haven't been borrowed.\n" +
      "1 Borrow a book.\n" +
      "2 Return a book.\n" +
      "3 Leave.\n" +
      "-------------------------------\n" +
      "You can get the function by typing numbers\n" +
      "Select an option: ";
    assertEquals(outContent.toString(), menu);
  }
  @Test
  public void testSelectMenu() {
    System.setIn(System.in);
    getMainMenuInstance().showMenu();
  }
  @Test
  public void testValidateMenu() {
    checkoutBookOption mockCheckoutBookOption = mock(checkoutBookOption.class);
    ByteArrayInputStream in = new ByteArrayInputStream("1".getBytes());
    System.setIn(in);
    replayAll();
    getMainMenuInstance().getOption(in);
    verifyAll();
  }

}

