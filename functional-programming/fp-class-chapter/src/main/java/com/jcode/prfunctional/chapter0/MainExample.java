package com.jcode.prfunctional.chapter0;

import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;

public class MainExample {

  public static String transformString(String input) {
    DateTimeFormatter inputFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mmX");
    DateTimeFormatter outputFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSSX");
    LocalDateTime localDateTime = LocalDateTime.parse(input, inputFormatter);
    String output = localDateTime.atZone(ZoneOffset.UTC).format(outputFormatter);

    return output;
  }

  public static void main(String[] args) {
    String input = "2023-10-31T00:00Z";
    String output = transformString(input);
    System.out.println(output);
  }


}
