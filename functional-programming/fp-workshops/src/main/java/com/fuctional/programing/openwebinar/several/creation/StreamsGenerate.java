package com.fuctional.programing.openwebinar.several.creation;

import java.util.UUID;
import java.util.stream.Stream;

public class StreamsGenerate {
  public static void main(String[] args) {

    // Stream infinitos
    Stream<String> uuidStream = Stream.generate(() -> UUID.randomUUID().toString());
    //intermediate operation
    uuidStream.limit(20)
        .forEach(System.out::println);

    Stream<Integer> numberGenerator = Stream.iterate(0, num -> num + 2);
    numberGenerator.limit(10).forEach(System.out::println);
  }
}
