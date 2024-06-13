package com.fuctional.programing.jeycode.function.unaryoperator;

import java.util.function.BinaryOperator;

public class BinaryOperation {

  public static void main(String[] args) {

    BinaryOperator<String> binaryOperator = (text, word) -> text.replace(word, "");
    var text = "Tres tristes tigres comían trigo en un trigal";
    var word = "Tres";
    System.out.println(binaryOperator.apply(text, word));
    BinaryOperator<Integer> binaryOperatorMAx = BinaryOperator.maxBy(Integer::compareTo);
    BinaryOperator<Integer> binaryOperatorMin = BinaryOperator.minBy(Integer::compareTo);
    System.out.println(binaryOperatorMAx.apply(1,2));
    System.out.println(binaryOperatorMin.apply(3,4));


  }
}
