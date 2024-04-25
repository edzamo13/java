package com.pichincha.poc.sellercredit.dto;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Builder
@AllArgsConstructor
public class GetSellerCreditOrderByFilterResponse {

  private String sellerCreditOrderId;
  private String customerAffiliationId;
  private String customerUserId;
  private String registerDate;
  private String trayOrderId;
  private String customerProductId;
  private UploadType uploadType;
  private SourceProduct sourceProduct;
  private ProcessingType processingType;
  private String expirationDate;
  private String executionDate;
  private CounterPart counterPart;
  private Status status;
  private List<SellerCreditOrderItems> sellerCreditOrderItems ;


}

