package com.fuctional.programing.jeycode.function;

import java.time.LocalDate;
import java.util.function.Function;

public class FunctionExample {

  public static void main(String[] args) {
    var chain = new StringBuilder("Using the interface");
    Function<StringBuilder, String> toString = cad -> cad.append(" add function!!")
        .toString();

    String usingFuction = usingFunction(toString, chain);
    System.out.println(usingFuction);

    var birth = LocalDate.of(1998, 3, 23);
    Function<LocalDate, Integer> age = date -> date.until(LocalDate.now())
        .getYears();
    Function<Integer, Sub> setAgeInSub = setSub -> new Sub("Add Value", setSub);// ageSet-> new Sub(ageSet)
    Function<Sub, String> subToString = Sub::toString;

    String usingFunctionCompose = usingFunctionCompose(subToString, setAgeInSub, age, birth);
    System.out.println(usingFunctionCompose);

    Function<Integer, Sub> setAgeInSubOther = setAgeInSubTwo -> new Sub(" Other Form", setAgeInSubTwo);
    String string = usingFunctionWithAndThen(subToString, setAgeInSubOther, age, birth);
    System.out.println(string);

  }


  private static <V, O, I, S> S usingFunctionWithAndThen(Function<O, S> funcString,
      Function<I, O> funcSub, Function<V, I> funcAge, V value) {
    System.out.println("My value:" + value);
    //after
    // 1, 2, 3
    return funcAge
        .andThen(funcSub)
        .andThen(funcString)
        .apply(value);
  }

  private static <V, O, I, S> S usingFunctionCompose(Function<O, S> funcString,
      Function<I, O> funcSub, Function<V, I> funcAge,
      V value) {
    //before
    //3,2,1
    return funcString
        .compose(funcSub)
        .compose(funcAge)
        .apply(value);
  }

  private static <T, R> R usingFunction(Function<T, R> function, T data) {
    return function.apply(data);
  }


}
