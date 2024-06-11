package com.fuctional.programing.jeycode.interfaces;

public class OperationImplFunctionAndLambda {

  public static void main(String[] args) {
    Operation operation = multiplication();
    Operation operationLambdaBasic = () -> 3.5f * 4;
    Operation operationLambdaWithMoreOperation = () -> {
      var num1 = 1;
      var num2 = 2;
      print("Print from lambda is a num1: " + num1 + "  a num2:  " + num2);
      return num2 * num2;
    };

    print("Operation basic:  " + operationLambdaBasic.operation());
    print("from lambda: " + operationLambdaWithMoreOperation.operation());

  }

  private static Operation multiplication() {
    Operation operation = new Operation() {
      @Override
      public float operation() {
        var value1 = 0.3f;
        var value2 = 0.2f;
        print("this is a values1: " + value1 + "this is a value 2:  " + value2);
        return value2 * value1;
      }


    };
    operation.operation();
    return operation;
  }

  private static void print(String value) {
    System.out.println(value);
  }

}
