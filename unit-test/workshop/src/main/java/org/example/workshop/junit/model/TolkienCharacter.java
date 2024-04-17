package org.example.workshop.junit.model;

import lombok.Data;
import org.example.workshop.junit.model.enums.Race;


@Data
public class TolkienCharacter {

  public int age;
  private String name;
  private Race race;

  // not accessible field to test that field by field comparison does not use it
  @SuppressWarnings("unused")
  private long notAccessibleField = System.currentTimeMillis();

  public TolkienCharacter(String frodo, int i, Race race) {

  }
}
