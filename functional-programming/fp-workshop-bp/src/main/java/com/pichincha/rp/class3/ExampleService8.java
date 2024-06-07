package com.pichincha.rp.class3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;


@Service
@SuppressWarnings({"java:S106", "java:S3864"})
public class ExampleService8 {


  public void calculate(List<Integer> dataList) {
    Mono.just(dataList)
        .map(ExampleService8::getMax)
        .map(list -> getMin(dataList, list))
        .map(list -> getAverage(dataList, list))
        .map(strings -> strings.stream()
            .collect(Collectors.joining(" , ")))
        .doOnSuccess(addResult -> System.out.println("Final Result: " + addResult))
        .subscribe();


  }

  private static List<String> getMax(List<Integer> max) {

    int resultMax = max
        .stream()
        .mapToInt(Integer::intValue)
        .max()
        .orElseThrow(NoSuchElementException::new);
    System.out.println("Numero Max is: " + resultMax);
    return Arrays.asList("Max ==>: " + resultMax);
  }

  private static List<String> getMin(List<Integer> max, List<String> results) {
    Integer resultMax = max
        .stream()
        .mapToInt(Integer::intValue)
        .min()
        .orElseThrow(NoSuchElementException::new);
    System.out.println("Numero min is: " + resultMax);
    List<String> resultsAdd = addResult(results, resultMax.toString(), "Min ==>: ");
    return resultsAdd;
  }

  private static List<String> getAverage(List<Integer> num, List<String> results) {
    Double resultAverage = num
        .stream()
        .mapToDouble(Integer::doubleValue)
        .average()
        .orElseThrow(NoSuchElementException::new);
    System.out.println("Numero Average is: " + resultAverage);
    List<String> resultsAdd = addResult(results, resultAverage.toString(), "Average ==>: ");
    return resultsAdd;
  }

  private static List<String> getSum(List<Integer> num, List<String> results) {
    Integer resultSum = num
        .stream()
        .mapToInt(Integer::intValue)
        .sum();
    System.out.println("Numero Sum is: " + resultSum);
    List<String> resultsAdd = addResult(results, resultSum.toString(), "Sum ==>: ");
    return resultsAdd;
  }

  private static List<String> addResult(List<String> results, String resultMax, String message) {
    List<String> resultsAdd = new ArrayList<>();
    resultsAdd.addAll(results);
    resultsAdd.add(message + resultMax);
    return resultsAdd;
  }
}
