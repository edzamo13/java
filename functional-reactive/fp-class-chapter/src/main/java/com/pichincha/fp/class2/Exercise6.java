package com.pichincha.fp.class2;

import java.util.Optional;

public class Exercise6 {
  public static void main(String[] args) {


   formatNumero1("1", "2", "3");
    formatNumero2("001-002-000000003");

  }

  private static void formatNumero2(String input) {
    Optional<String> result = Optional.ofNullable(input)
        .map(s -> s.replaceAll("-", ""))
        .map(s -> String.format("%1$15s", s).replace(' ', '0'));

    if (result.isPresent()) {
      System.out.println(result.get());
    } else {
      System.out.println("Cadena de entrada nula.");
    }
  }

  public static void formatNumero1(String numero1, String numero2, String numero3) {
    String formattedNumero = String.format("%03d-%03d-%09d",
        Integer.parseInt(Optional.ofNullable(numero1).orElse("0")),
        Integer.parseInt(Optional.ofNullable(numero2).orElse("0")),
        Integer.parseInt(Optional.ofNullable(numero3).orElse("0")));
    System.out.println(formattedNumero);

  }

}
