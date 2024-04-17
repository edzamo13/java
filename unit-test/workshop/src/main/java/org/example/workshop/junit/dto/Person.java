package org.example.workshop.junit.dto;


import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Person {

  private  String name;
  private String lastName;
  private int age;
}
