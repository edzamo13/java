package com.pichincha.fp.class2;

import java.util.function.Function;

public class SwitchExample {
/*

  public static void main(String[] args) {
 String validation = performActionBasedOnChoice("example");

    System.out.println("----" + validation);

  }

  public static String performActionBasedOnChoice(String choice) {
    switch (choice) {
      case "hola":
        return "Ejecutando acción 1";
      case "adios":
        return "Ejecutando acción 2";
      case "example":
        return "Ejecutando acción 3";
      default:
        return "Ejecutando acción 4";
    }
  }*/


  public static void main(String[] args) {
    String choice = "adios";

    Function<String, String> action = choiceValue -> performActionBasedOnChoice(choiceValue);

    String result = action.apply(choice);
    System.out.println("Resultado: " + result);
  }

  public static String performActionBasedOnChoice(String choice) {
    switch (choice) {
      case "hola":
        return "Ejecutando acción 1";
      case "adios":
        return "Ejecutando acción 2";
      case "example":
        return "Ejecutando acción 3";
      default:
        return "Ejecutando acción 4";
    }
  }
}
