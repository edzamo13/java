package com.fuctional.programing.openwebinar.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {

  private String sku;
  private String name;
  private Double price;
  private boolean discount;

}
