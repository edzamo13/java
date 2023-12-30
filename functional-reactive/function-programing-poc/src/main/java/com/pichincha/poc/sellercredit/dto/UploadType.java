package com.pichincha.poc.sellercredit.dto;

import lombok.Builder;
import lombok.Data;


@Data
@Builder
public class UploadType {

  private String code;
  private String description;


}

