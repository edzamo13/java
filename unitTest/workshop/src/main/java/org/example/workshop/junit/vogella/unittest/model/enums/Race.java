package org.example.workshop.junit.vogella.unittest.model.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;


@Getter
@AllArgsConstructor
public enum Race {

  HOBBIT("Hobbit", false, Alignment.GOOD), MAIA("Maia", true, Alignment.GOOD),

  MAN("Man", false, Alignment.NEUTRAL), ELF("Elf", true, Alignment.GOOD),

  DWARF("Dwarf", false, Alignment.GOOD), ORC("Orc", false, Alignment.EVIL);


  private final String name;
  private final boolean immortal;
  private final Alignment alignment;
}
