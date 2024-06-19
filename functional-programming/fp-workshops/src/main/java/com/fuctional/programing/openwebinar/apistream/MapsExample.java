package com.fuctional.programing.openwebinar.several;

import com.fuctional.programing.openwebinar.dto.Developer;
import com.fuctional.programing.openwebinar.dto.Task;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;

public class MapsExample {

  public static void main(String[] args) {

    mapUpperCaseAndSorter(getNames());
    mapOperations01(getDevelopers());
    mapOperationInteger(getListOfListNumbers());


  }

  private static void mapOperationInteger(List<List<Integer>> numbers) {
    numbers.stream()
        .flatMap(Collection::stream)// .flatMap(integers -> integers.stream())
        .peek(System.out::println)// peek this a consumer no return nothing
        .filter(integer -> integer > 50)
        .map(filterNum -> filterNum * 2)
        .forEach(System.out::println);
  }

  private static void mapOperations01(List<Developer> developers) {
    //flapMap using for planing object
    //When you have a data structure inside another data structure, we use flapMap
    developers.stream()
        .flatMap(developer -> developer.getTasks().stream())
        .filter(tasks -> tasks.getHours() > 5)
        .forEach(System.out::println);
  }

  private static void mapUpperCaseAndSorter(List<String> names) {
    names.stream()
        .map(String::toUpperCase)
        .distinct()
        .sorted(Comparator.comparing(String::length))
        .forEach(System.out::println);
  }

  private static List<String> getNames() {
    return List.of("Ewin", "Jose", "Jose", "Zamuel", "Raquel");
  }

  private static List<Developer> getDevelopers() {
    return List.of(new Developer("dev1", 25, getTasks1()),
        new Developer("dev2", 30, getTasks2()),
        new Developer("dev3", 50, getTasks3()));
  }

  private static List<Task> getTasks1() {
    return List.of(new Task(1, "Task1", 5), new Task(2, "Task1", 5),
        new Task(3, "Task1", 5), new Task(4, "Task1", 5));
  }

  private static List<Task> getTasks2() {
    return List.of(new Task(6, "Task4", 5), new Task(7, "Task3", 6),
        new Task(8, "Task4", 5), new Task(9, "Task1", 7));
  }

  private static List<Task> getTasks3() {
    return List.of(new Task(10, "Task5", 8), new Task(11, "Task6", 3),
        new Task(12, "Task7", 8), new Task(13, "Task8", 3));
  }

  private static List<List<Integer>> getListOfListNumbers() {
    List<Integer> list1 = List.of(1, 2, 3, 4);
    List<Integer> list2 = List.of(10, 20, 30, 40);
    List<Integer> list3 = List.of(100, 200, 300, 400);
    return List.of(list1, list2, list3);
  }

}
