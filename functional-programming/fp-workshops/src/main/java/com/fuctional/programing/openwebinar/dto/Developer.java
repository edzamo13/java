package com.fuctional.programing.openwebinar.dto;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Developer {
  private  String name;
  private Integer age;
  private List<Task> tasks;


}
