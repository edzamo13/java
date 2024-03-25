package org.example.workshop.junit.vogella.unittest.model;


import java.util.Date;
import lombok.Data;

@Data
public class Movie {

  private String title;
  private Date releaseDate;
  @SuppressWarnings("unused")
  private String duration;
}
