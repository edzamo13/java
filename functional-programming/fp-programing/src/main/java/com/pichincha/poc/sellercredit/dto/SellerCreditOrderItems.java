package com.pichincha.poc.sellercredit.dto;

import java.math.BigDecimal;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class SellerCreditOrderItems {

  private String sellerCreditOrderItemId;
  private BigDecimal amount;
  private Currency currency;
  private Status status;
  private Beneficiary beneficiary;
  private DestinationProduct destinationProduct;
  private String description;
  private CounterPartItem counterPart;
  private PaymentMethod paymentMethod;
}

