package com.pichincha.fp.class2;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Exercise8 {

  public static void main(String[] args) {

    List<Integer> listNumbers = IntStream.range(1, 100)
        .boxed()
        .collect(Collectors.toList());

    extracted(listNumbers);


  }

  private static void extracted(List<Integer> listNumbers) {
    Function<List<Integer>, Integer> findMax = list -> list
        .stream()
        .mapToInt(Integer::intValue)
        .max()
        .orElseThrow(NoSuchElementException::new);
    int max = findMax.apply(listNumbers);
    log.info("Number Max: {}", max);
    Function<List<Integer>, Integer> finMin = list -> list
        .stream()
        .mapToInt(Integer::intValue)
        .min()
        .orElseThrow(NoSuchElementException::new);
    int min = finMin.apply(listNumbers);
    log.info("Number min: {}", min);
    Function<List<Integer>, Double> findAverage = list -> list
        .stream()
        .mapToDouble(Integer::doubleValue)
        .average()
        .orElseThrow(NoSuchElementException::new);
    double average = findAverage.apply(listNumbers);
    log.info("average: {}", average);
    Function<List<Integer>, Integer> findSum = list -> list
        .stream()
        .mapToInt(Integer::intValue)
        .sum();
    double sum = findSum.apply(listNumbers);
    log.info("sum: {}", sum);


    log.info("Imprimir min: {} max: {} average:{} sum:{}", min, max, average, sum);
  }


}
