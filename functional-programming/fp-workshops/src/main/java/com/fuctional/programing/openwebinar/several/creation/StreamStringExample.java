package com.fuctional.programing.openwebinar.several.creation;

import java.util.List;
import java.util.stream.Stream;

public class StreamStringExample {

  public static void main(String[] args) {
    Stream<String> stringStream = Stream.empty();
Stream<String> joinStream = Stream.concat(stringStream,getStrings().stream());

    joinStream.forEach(System.out::println);

  }


  private static List<String> getStrings() {

    return List.of("Elvin", "JOse", "Manuel", "Maria");
  }

}
