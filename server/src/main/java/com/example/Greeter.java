package com.example;

/**
 * This is a class.
 */
public class Greeter {

  /**
   * This is a constructor.
   */
  public Greeter() {

  }

 /**
  * @param : some name of person
  * @return : name of the string
  */
  public final String greet(final String someone) {
    return String.format("Hello, %s!", someone);
  }
}
