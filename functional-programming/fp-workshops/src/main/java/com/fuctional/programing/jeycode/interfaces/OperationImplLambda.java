package com.fuctional.programing.jeycode.interfaces;

public class OperationImplLambda {

  private static void printResult(Operation operation) {
    System.out.println("Result of operation :" + operation.operation());
  }

  public static void main(String[] args) {

    printResult(() -> 5.3f * 3);

  }

}
