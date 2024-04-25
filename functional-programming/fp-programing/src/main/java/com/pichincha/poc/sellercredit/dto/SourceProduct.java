package com.pichincha.poc.sellercredit.dto;


import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class SourceProduct {

  private String productNumber;
  private ProductType productType;
  private Currency currency;

}

