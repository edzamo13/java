package com.fuctional.programing.jeycode.interfaces;

public class OperationImplLambdaAnonimus {

  private float anyMethod() {
    return 2 / 5;
  }

  private static void printResult(Operation operation) {
    System.out.println("Result of operation :" + operation.operation());
  }

  public void main(String[] args) {
    printResult(this::anyMethod);

  }


}
