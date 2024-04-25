package com.pichincha.fp.class2;

import java.util.Optional;

public class Exercise7 {

  public static void main(String[] args) {
    int number = 123456789;
    Optional<String> formattedNumber = formatNumber(number);

    if (formattedNumber.isPresent()) {
      System.out.println("Format number: " + formattedNumber.get());
    } else {
      System.out.println("The number have format problem.");
    }
  }

  public static Optional<String> formatNumber(int number) {
    String numberStr = String.valueOf(number);

    if (numberStr.length() == 9) {
      String formattedNumber =
          numberStr.substring(0, 3) + "-" + numberStr.substring(3, 6) + "-" + numberStr.substring(
              6);
      return Optional.of(formattedNumber);
    } else {
      return Optional.empty();
    }
  }
}
