package com.fuctional.programing.jeycode.consumer;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class BiConsumerExample {

  static List<String> names;

  public static void main(String[] args) {
    names = new ArrayList<>();
    names.add("Ewin");
    usingBiConsumer(1, "Name 2",
        BiConsumerExample::getPrintln,
        (s, s2) -> names.add(s, s2),
        BiConsumerExample::getPrintAfter);
  }

  private static void getPrintln(Integer s, String s2) {
    System.out.println("add index:" + s + " value: " + s2);
  }

  private static void getPrintAfter(Integer s) {
    System.out.println("List of names: " + names.toString());
  }


  private static <T, U> void usingBiConsumer(T value1, U value2, BiConsumer<T, U> biConsumer,
      BiConsumer<T, U> biConsumerAdd, Consumer<T> consumerPrint) {

    biConsumer.andThen(biConsumerAdd)
        .accept(value1, value2);
    consumerPrint.accept(value1);
        /*.andThen(biConsumerPrint)
        .accept(value1, value2);*/

  }

}
