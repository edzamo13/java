package com.fuctional.programing.jeycode.interfaces;

public class OperationImpl implements Operation {

  @Override
  public float operation() {
    return 0;
  }

  @Override
  public void interfacesDefaultMethod() {
    Operation.super.interfacesDefaultMethod();
  }

  public static void main(String[] args) {
    new OperationImpl();
  }
}
