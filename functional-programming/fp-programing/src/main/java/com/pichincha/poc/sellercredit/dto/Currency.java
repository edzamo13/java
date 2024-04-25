package com.pichincha.poc.sellercredit.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Currency {

  private String code;
  private String description;


}

