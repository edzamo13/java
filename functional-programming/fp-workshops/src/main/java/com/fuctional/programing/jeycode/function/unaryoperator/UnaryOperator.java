package com.fuctional.programing.jeycode.function.unaryoperator;

import java.util.ArrayList;
import java.util.List;

public class UnaryOperator {

  public static void main(String[] args) {

    System.out.println(usingUnaryOperator(String::toUpperCase, List.of("Edwin", "JOse", "Manuel", "Pedro")));


  }

  private static <T> List<T> usingUnaryOperator(java.util.function.UnaryOperator<T> tUnaryOperator, List<T> tList) {
    System.out.println("tList"+tList);
    List<T> finalTList = new ArrayList<>();
    tList.forEach(element -> finalTList.add(tUnaryOperator.apply(element)));
    return finalTList;
  }

}
