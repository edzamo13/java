package com.pichincha.poc.sellercredit.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class DestinationProduct {
  public static final String JSON_PROPERTY_PRODUCT_NUMBER = "productNumber";
  private String productNumber;

  public static final String JSON_PROPERTY_PRODUCT_TYPE = "productType";
  private ProductType productType;

}

