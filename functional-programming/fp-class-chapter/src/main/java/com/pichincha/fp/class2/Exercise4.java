package com.pichincha.fp.class2;


import java.util.stream.IntStream;
import org.springframework.stereotype.Service;

@Service
@SuppressWarnings("java:S106")
public class Exercise4 {


  public static void main(String[] args) {
    int n = 5;
    int factorial = calculateFactorial(n);
    System.out.println("Factorial of: " + n + ": " + factorial);
  }
  public static int calculateFactorial(int n) {
    return IntStream.rangeClosed(1, n)
        .reduce(1, (x, y) -> x * y);
  }


}
