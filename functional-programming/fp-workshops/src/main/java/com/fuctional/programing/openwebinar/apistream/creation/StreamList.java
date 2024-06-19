package com.fuctional.programing.openwebinar.apistream.creation;

import java.util.List;

public class StreamList {

  public static void main(String[] args) {

    System.out.println("count: "+getStrings().stream().count());

  }


  private static List<String> getStrings() {

    return List.of("Elvin", "JOse", "Manuel", "Maria");
  }

}
