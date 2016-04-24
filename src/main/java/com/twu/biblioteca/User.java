package com.twu.biblioteca;

public class User {
  private String name;
  private String email;
  private String phone;
  private String address;
  private String library_number;
  private String password;
  private boolean isAdmin;

  public User(String name, String email, String phone, String address, String library_number, boolean isAdmin) {
    this.name = name;
    this.email = email;
    this.phone = phone;
    this.address = address;
    this.library_number = library_number;
    this.isAdmin = isAdmin;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public String getLibrary_number() {
    return library_number;
  }

  public void setLibrary_number(String library_number) {
    this.library_number = library_number;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public boolean isAdmin() {
    return isAdmin;
  }

  public void setAdmin(boolean admin) {
    isAdmin = admin;
  }
}
