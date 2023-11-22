package com.pichincha.fp.class2Result;

import java.util.Collections;
import java.util.stream.IntStream;
import org.springframework.stereotype.Service;

@Service
@SuppressWarnings("java:S106")
public class Exercise3Service {
  public void printRightTriangle1(final int size) {
    for (int i = 1; i <= size; ++i) {
      for (int j = 1; j <= i; ++j) {
        System.out.print(i);
      }
      System.out.println();
    }
  }

  public void printRightTriangle2(final int size) {
    IntStream.rangeClosed(1, size)
      .forEach(i -> {
        Collections.nCopies(i, i).forEach(System.out::print);
        System.out.println();
      });
  }
}
