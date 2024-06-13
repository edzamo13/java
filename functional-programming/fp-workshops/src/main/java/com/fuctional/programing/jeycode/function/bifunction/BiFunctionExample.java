package com.fuctional.programing.jeycode.function.bifunction;

import java.util.List;
import java.util.Optional;
import java.util.function.BiFunction;
import java.util.function.Function;

public class BiFunctionExample {

  public static void main(String[] args) {

    System.out.println(usingFunction("join ", "cadena", String::concat));
    System.out.println(Optional.ofNullable(usingFunction(List.of(1, 2, 3, 4), 4, List::contains)));
    System.out.println(usingFunctionWihAndEnd("Arriba", "Abajo", String::equals, BiFunctionExample::sendResponse));


  }

  private static String sendResponse(Boolean aBoolean) {
    return aBoolean ? "Same object" : "different";
  }

  private static <T, U, R> R usingFunction(T value, U value2, BiFunction<T, U, R> biFunction) {
    return biFunction.apply(value, value2);
  }

  private static <T, U, R, O> O usingFunctionWihAndEnd(T value, U value2, BiFunction<T, U, R> biFunction, Function<R, O> function) {
    return biFunction
        .andThen(function)
        .apply(value, value2);
  }

}
