package com.pichincha.fp.class2;

import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;
import lombok.Builder;
import lombok.RequiredArgsConstructor;
import lombok.Value;
import lombok.experimental.Accessors;
import lombok.extern.slf4j.Slf4j;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
@SuppressWarnings({"java:S106", "java:S3864"})
public class Exercise8Service {
  /*
  Resolver el ejercicio con composición de Functions (andThen o compose) y streams.

  Entrada: Lista de valores dobles.

  Proceso:

  1. Imprimir valores de la lista en la consola.
  2. Obtener el número mínimo de la lista e imprimir en los logs.
  3. Obtener el número máximo de la lista e imprimir en los logs.
  4. Obtener el número promedio de la lista e imprimir en los logs.
  5. Obtener la suma total de la lista e imprimir en los logs.
  6. Imprimir al final en la consola el mínimo, máximo, promedio y total en una sola línea.
  */
  @NonNull
  private static <T> UnaryOperator<T> peek(@NonNull final Consumer<T> consumer) {
    return input -> {
      consumer.accept(input);
      return input;
    };
  }

  @Value
  @Accessors(fluent = true)
  @Builder(toBuilder = true)
  public static class Data {
    double min;
    double max;
    double average;
    double sum;
  }

  private static final UnaryOperator<List<Double>> printValues = values ->
    Optional.of(values)
      .map(peek(theValues ->
        System.out.println("values=" + values.stream().map(String::valueOf).collect(Collectors.joining(","))))
      )
      .orElseGet(List::of);

  private static final Function<List<Double>, Data> getMin = values ->
    Data.builder()
      .min(
        values.stream().min(Double::compareTo)
          .map(peek(min -> log.info("min={}", min)))
          .orElse(0.0)
      )
      .build();

  private static final Function<List<Double>, UnaryOperator<Data>> getMax = values -> data ->
    data.toBuilder()
      .max(
        values.stream().max(Double::compareTo)
          .map(peek(max -> log.info("max={}", max)))
          .orElse(0.0)
      )
      .build();

  private static final Function<List<Double>, UnaryOperator<Data>> getAverage = values -> data ->
    data.toBuilder()
      .average(
        Optional.of(values.stream().mapToDouble(Double::valueOf).average().orElse(0.0))
          .map(peek(average -> log.info("average={}", average)))
          .orElse(0.0)
      )
      .build();

  private static final Function<List<Double>, UnaryOperator<Data>> getSum = values -> data ->
    data.toBuilder()
      .sum(
        Optional.of(values.stream().mapToDouble(Double::valueOf).sum())
          .map(peek(sum -> log.info("sum={}", sum)))
          .orElse(0.0)
      )
      .build();

  @NonNull
  public Data processValues(@NonNull final List<Double> values) {
    return printValues.andThen(getMin)
      .andThen(getMax.apply(values))
      .andThen(getAverage.apply(values))
      .andThen(getSum.apply(values))
      .apply(values);
  }
}
