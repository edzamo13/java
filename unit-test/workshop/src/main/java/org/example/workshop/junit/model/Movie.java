package org.example.workshop.junit.model;


import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Movie {

  private String title;
  private Date releaseDate;
  @SuppressWarnings("unused")
  private String duration;


}
