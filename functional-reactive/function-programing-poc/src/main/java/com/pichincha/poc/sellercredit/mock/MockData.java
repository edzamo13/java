package com.pichincha.poc.sellercredit.mock;

import com.pichincha.poc.sellercredit.dto.Beneficiary;
import com.pichincha.poc.sellercredit.dto.CounterPart;
import com.pichincha.poc.sellercredit.dto.CounterPartItem;
import com.pichincha.poc.sellercredit.dto.Currency;
import com.pichincha.poc.sellercredit.dto.DestinationProduct;
import com.pichincha.poc.sellercredit.dto.GetSellerCreditOrderByFilterResponse;
import com.pichincha.poc.sellercredit.dto.PaymentMethod;
import com.pichincha.poc.sellercredit.dto.ProcessingType;
import com.pichincha.poc.sellercredit.dto.ProductType;
import com.pichincha.poc.sellercredit.dto.SellerCreditOrderItems;
import com.pichincha.poc.sellercredit.dto.SourceProduct;
import com.pichincha.poc.sellercredit.dto.Status;
import com.pichincha.poc.sellercredit.dto.UploadType;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Arrays;

public class MockData {

  public static final String BS_ORDER_STATUS_PENDING = "PENDING";
  public static final String BS_ORDER_STATUS_PARTIAL = "PARTIALLY_SATISFACTORY";

  public static GetSellerCreditOrderByFilterResponse getGetSellerCreditOrderByFilterResponse() {
    return GetSellerCreditOrderByFilterResponse.builder()
        .sellerCreditOrderId("12345678-eb18-432b-a9ac-0aa5e80ebe9a")
        .customerAffiliationId("qwerccf-a60b-45e8-b5e3-215924834e5")
        .customerUserId("qwerccf-a60b-45e8-b5e3-215924834e5")
        .registerDate(LocalDate.now().toString())
        .trayOrderId("14621")
        .customerProductId("11073D363-E6D9-4701-AA19-00E1B3DB5613")
        .uploadType(UploadType.builder().code("MASIVA").description("Carga por archivo").build())
        .sourceProduct(SourceProduct.builder()
            .productNumber("50123098678")
            .productType(ProductType.builder().code("0001").description("AHORRO").build())
            .currency(Currency.builder().code("USD").description("Dollar USD").build())
            .build())
        .processingType(ProcessingType.builder().code("IMMEDIATE").build())
        .executionDate("2023-10-26")
        .expirationDate("2023-10-26")
        .counterPart(CounterPart.builder()
            .description("NOMBRE ARCHIVO").identificationValue("CARGA_FACTURAS_JULIO.XLSX").build())
        .status(Status.builder().code("PENDING").build())
        .sellerCreditOrderItems(Arrays.asList(
            SellerCreditOrderItems.builder()
                .sellerCreditOrderItemId("8e5bb518-bad8-4c63-8455-057d82ee1e17")
                .amount(new BigDecimal(1000))
                .currency(Currency.builder().code("USD").description("Dollar USD").build())
                .status(Status.builder().code("FAIL").build())//SUCCEEDED//PENDING//FAIL
                .beneficiary(Beneficiary.builder().fullName("Jesus Alberto").documentType("0001")
                    .documentNumber("2100080794").email("email@email.com").build())
                .destinationProduct(DestinationProduct.builder()
                    .productNumber("2100080794")
                    .productType(ProductType.builder().code("0001").description("AHORRO").build())
                    .build())
                .counterPart(
                    CounterPartItem.builder().identificationValue("220292091")
                        .description("Description").build())
                .paymentMethod(PaymentMethod.builder().code("1").description("Pago Online").build())
                .build(),
            SellerCreditOrderItems.builder()
                .sellerCreditOrderItemId("8e5bb518-bad8-4c63-8455-057d82ee1e19")
                .amount(new BigDecimal(1000))
                .currency(Currency.builder().code("USD").description("Dollar USD").build())
                .status(Status.builder().code("SUCCEEDED").build())//SUCCEEDED
                .beneficiary(Beneficiary.builder().fullName("Miguel Alberto").documentType("0001")
                    .documentNumber("2100080794").email("email@email.com").build())
                .destinationProduct(DestinationProduct.builder()
                    .productNumber("2100080794")
                    .productType(ProductType.builder().code("0001").description("AHORRO").build())
                    .build())
                .counterPart(
                    CounterPartItem.builder().identificationValue("220292091")
                        .description("Description").build())
                .paymentMethod(PaymentMethod.builder().code("1").description("Pago Online").build())
                .build()
        )).build();
  }

}
