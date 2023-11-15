package com.pichincha.fp.class2;


import java.util.stream.IntStream;
import org.springframework.stereotype.Service;

@Service
@SuppressWarnings("java:S106")
public class Exercise3 {


  public void printRightTriangle(final int size) {
    triangle(5);
  }
  private void triangle(final int size) {
    IntStream.range(1, size)
        .forEach(i -> {
          IntStream.rangeClosed(1, i)
              .forEach(j -> System.out.print(i));
          System.out.println();
        });


  }

}
