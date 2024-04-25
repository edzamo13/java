package com.pichincha.fp.class2;

import com.pichincha.fp.class2.Exercise1Service.StringCaseEnum;
import java.util.List;
import java.util.stream.Stream;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
@SuppressWarnings("java:S106")
public class Runner implements CommandLineRunner {
  private static final String LINE = "==========================================================================";

  private final Exercise1Service exercise1Service;
  private final Exercise2Service exercise2Service;
  private final Exercise3Service exercise3Service;
  private final Exercise4Service exercise4Service;
  private final Exercise5Service exercise5Service;
  private final Exercise6Service exercise6Service;
  private final Exercise7Service exercise7Service;
  private final Exercise8Service exercise8Service;

  @Override
  public void run(final String... args) {
    runExercise1();
    runExercise2();
    runExercise3();
    runExercise4();
    runExercise5();
    runExercise6();
    runExercise7();
    runExercise8();
  }

  private static void printLine() {
    System.out.println(LINE);
  }

  private static void printTitle(@NonNull final String title) {
    System.out.println("                               " + title + "                                 ");
  }

  private void runExercise1() {
    printLine();
    printTitle("Exercise 1");
    printLine();
    final var value = "the Value";
    Stream.of(StringCaseEnum.values())
      .forEach(stringCase ->
        System.out.println(
          "value=" + value
            + ", case=" + stringCase
            + ", imperative=" + exercise1Service.transformString1(value, stringCase)
            + ", functional=" + exercise1Service.transformString2(value, stringCase)
        )
      );
    System.out.println();
  }

  private void runExercise2() {
    printLine();
    printTitle("Exercise 2");
    printLine();
    Stream.of(1_000_001, 500_001, 200, 0, -1)
      .forEach(value -> {
        System.out.print("value=" + value);
        try {
          System.out.print(", imperative=" + exercise2Service.getFee1(value));
        } catch (final Exception e) {
          System.out.print(", imperative threw an exception");
        }
        try {
          System.out.print(", functional=" + exercise2Service.getFee4(value));
        } catch (final Exception e) {
          System.out.print(", functional threw an exception");
        }
        System.out.println();
      });
    System.out.println();
  }

  private void runExercise3() {
    printLine();
    printTitle("Exercise 3");
    printLine();
    Stream.of(4, 6)
      .forEach(size -> {
        System.out.println("size=" + size);
        System.out.println("imperative:");
        exercise3Service.printRightTriangle1(size);
        System.out.println("functional:");
        exercise3Service.printRightTriangle2(size);
        System.out.println();
      });
  }

  private void runExercise4() {
    printLine();
    printTitle("Exercise 4");
    printLine();
    Stream.of(2, 5, 7)
      .forEach(n -> {
        System.out.println("imperative factorial of " + n + ": " + exercise4Service.factorial1(n));
        System.out.println("functional factorial of " + n + ": " + exercise4Service.factorial2(n));
        System.out.println();
      });
  }

  private void runExercise5() {
    printLine();
    printTitle("Exercise 5");
    printLine();
    final var init = 1;
    Stream.of(3, 6)
      .forEach(n -> {
        System.out.println("init=" + init + ", n=" + n);
        System.out.println("result=" + exercise5Service.generateNumbers(init, n));
        System.out.println();
      });
  }

  private void runExercise6() {
    printLine();
    printTitle("Exercise 6");
    printLine();
    Stream.of(
        "1",
        "0-1-1",
        "1001900000041",
        "1-002-000000031",
        "001002900000032",
        "001-002-000000033",
        "1-2-4124",
        "1-2-900004420",
        "1-002-4819",
        "001-1-000000039",
        "001-001-40",
        "001002000000030"
      )
      .forEach(value ->
        System.out.println("invoice number=" + value + ", validation=" + exercise6Service.validateInvoiceNumber(value))
      );
    System.out.println();
  }

  private void runExercise7() {
    printLine();
    printTitle("Exercise 7");
    printLine();
    Stream.of(
        "1",
        "0-1-1",
        "1001900000041",
        "1-002-000000031",
        "001002900000032",
        "001-002-000000033",
        "1-2-4124",
        "1-2-900004420",
        "1-002-4819",
        "001-1-000000039",
        "001-001-40",
        "001002000000030"
      )
      .forEach(value -> {
        try {
          System.out.println(
            "invoice number=" + value + ", formatted invoice number=" + exercise7Service.formatInvoiceNumber(value)
          );
        } catch (final Exception e) {
          System.out.println("invoice number " + value + " threw an exception");
        }
      });
    System.out.println();
  }

  private void runExercise8() {
    printLine();
    printTitle("Exercise 8");
    printLine();
    final var data = exercise8Service.processValues(List.of(50.0, 60.0, 70.0, 80.0, 100.0));
    System.out.printf(
      "min=%f, max=%f, average=%f, sum=%f%n",
      data.min(),
      data.max(),
      data.average(),
      data.sum()
    );
    System.out.println();
  }
}
