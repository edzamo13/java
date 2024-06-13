package com.fuctional.programing.jeycode.consumer;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {

  static List<String> listName;

  public static void main(String[] args) {
    listName = new ArrayList<>();
    listName.add("Edwin");
    listName.add("Paula");
    listName.add("Pedro");

    usingConsumer("Karen add name example ",
        System.out::println,
        listName::add,
        ConsumerExample::printList);
  }

  private static <T> void printList(T value) {
    System.out.println("List Name contain:" + listName.toString() + " list size:" + listName.size());
  }

  private static <T> void usingConsumerAccept(T value, Consumer<T> consumer, Consumer<T> consumer1, Consumer<T> consumer2) {
    consumer.accept(value);
    consumer1.accept(value);
    consumer2.accept(value);

    consumer2.andThen(consumer1).andThen(consumer);

  }

  private static <T> void usingConsumer(T value, Consumer<T> consumer, Consumer<T> consumer1, Consumer<T> consumer2) {

    var consumerCompleted = consumer.andThen(consumer1).andThen(consumer2);
    consumerCompleted.accept(value);

  }

}
