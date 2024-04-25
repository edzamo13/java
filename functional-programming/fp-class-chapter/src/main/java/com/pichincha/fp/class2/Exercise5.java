package com.pichincha.fp.class2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Exercise5 {

  public static void main(String[] args) {

     Collections.singletonList(IntStream.range(1, 100)
        .boxed()
        .collect(Collectors.toList())
        .stream().peek(pair-> System.out.println("pair numbers:" + pair))
        .filter(num -> num % 2 == 0)
        .map(Objects::toString)
        .collect(Collectors.joining(",")))
        .forEach(System.out::println);
  }

}
