package com.fuctional.programing.openwebinar.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Task {

  private Integer id;
  private String title;
  private Integer hours;

}