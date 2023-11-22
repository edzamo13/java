package com.jcode.prfunctional.chapter0;

@FunctionalInterface
public interface Operation {

  //always need class abstract
  float operation();

  private void interfacePrivateMethod() {
    System.out.println("Calling interface private method ");
    interfaceStaticMethod();
  }

  static void interfaceStaticMethod() {
    System.out.println("calling interface static method ");
  }

  default void interfaceDefaultMethod() {
    interfacePrivateMethod();
    interfaceStaticMethod();
    System.out.println("Calling interface default method ");
  }
}
