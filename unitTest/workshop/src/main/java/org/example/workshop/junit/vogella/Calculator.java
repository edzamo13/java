package org.example.workshop.junit.vogella;

public class Calculator {

  public int multiply(int a, int b) {
    return a * b;
  }

  public int multiplyException(int x, int y) {
    if (x > 999) {
      throw new IllegalArgumentException("X should be less than 1000");
    }
    return x / y;
  }

}
