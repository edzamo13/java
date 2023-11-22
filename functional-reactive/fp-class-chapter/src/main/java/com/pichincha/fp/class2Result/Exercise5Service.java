package com.pichincha.fp.class2Result;

import java.util.stream.Collectors;
import java.util.stream.IntStream;
import org.springframework.stereotype.Service;

@Service
@SuppressWarnings({"java:S106", "java:S3864"})
public class Exercise5Service {
  /*
    Utilizar streams para resolver el siguiente ejercicio:

    Generar un rango de números enteros.

    Imprimir en consola los números enteros generados.

    Filtrar solo los números pares.

    Concatenar en una cadena los números pares separados por coma.

    Imprimir en consola la cadena de resultado.
   */
  public String generateNumbers(final int init, final int n) {
    return IntStream.rangeClosed(init, n)
      .peek(System.out::println)
      .filter(number -> number % 2 == 0)
      .mapToObj(String::valueOf)
      .collect(Collectors.joining(","));
  }
}
