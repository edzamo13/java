package com.pichincha.fp.class2;

import org.springframework.lang.NonNull;
import org.springframework.stereotype.Service;

@Service
@SuppressWarnings("java:S106")
public class ExampleService {
  public enum StringCaseEnum {
    NONE,
    LOWER,
    UPPER,
    CAPITAL
  }

  @NonNull
  public String transformString(@NonNull final String value, @NonNull final StringCaseEnum stringCase) {
    return switch (stringCase) {
      case NONE -> value;
      case LOWER -> value.toLowerCase();
      case UPPER -> value.toUpperCase();
      case CAPITAL -> value.substring(0, 1).toUpperCase() + value.substring(1).toLowerCase();
    };
  }

  public enum FeeEnum {
    NONE,
    LOW,
    MEDIUM,
    HIGH
  }

  @NonNull
  public FeeEnum getFee(final double income) {
    if (income < 0) {
      throw new IllegalArgumentException();
    }
    if (income > 1_000_000) {
      return FeeEnum.HIGH;
    }
    if (income > 500_000) {
      return FeeEnum.MEDIUM;
    }
    return FeeEnum.LOW;
  }

  public void printRightTriangle(final int size) {
    for (int i = 1; i <= size; ++i) {
      for (int j = 1; j <= i; ++j) {
        System.out.print(i);
      }
      System.out.println();
    }
  }

  public int factorial(final int n) {
    int fact = 1;
    for (int i = 1; i <= n; ++i) {
      fact = fact * i;
    }
    System.out.println("Factorial of " + n + ": " + fact);
    return fact;
  }
}
