package com.fuctional.programing.openwebinar.apistream;

import com.fuctional.programing.openwebinar.dto.Developer;
import com.fuctional.programing.openwebinar.dto.Task;
import java.util.List;
import java.util.stream.Stream;

public class StreamWhileExample {

  public static void main(String[] args) {
    usingTakeWhile(getDevelopers());
    System.out.println("--------");
    usingDropWhile(getDevelopers());
    System.out.println("--------");

    Stream.of(1, 2, 3, 4, 5, 6).takeWhile(i -> i % 2 == 0).forEach(System.out::println);
    System.out.println("--------");
    Stream.of(1,2,3,4,5,6).dropWhile(i -> i <= 3).forEach(System.out::println);

  }

  private static void usingTakeWhile(List<Developer> developers) {
    developers.stream()
        .flatMap(developer -> developer.getTasks().stream())
        .takeWhile(task -> task.getHours() < 6)
        .forEach(System.out::println);
  }

  private static void usingDropWhile(List<Developer> developers) {
    developers.stream()
        .flatMap(developer -> developer.getTasks().stream())
        .dropWhile(task -> task.getHours() < 6)
        .forEach(System.out::println);
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

}
