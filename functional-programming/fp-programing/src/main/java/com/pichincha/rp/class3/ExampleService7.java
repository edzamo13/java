package com.pichincha.rp.class3;

import java.util.List;
import java.util.Optional;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;


@Data
@Service
@RequiredArgsConstructor
@SuppressWarnings({"java:S106", "java:S3864"})
public class ExampleService7 {

  private static final Pattern INVOICE_NUMBER_PATTERN = Pattern.compile(
      "^(\\d{1,3}-\\d{1,3}-\\d{1,9}|\\d{13,15})$");

  private static  ExampleService6 service;
  public Flux<List<String>> printValidation(List<String> invoices) {
    return Flux.just(invoices)
        .map(strings -> strings.stream()
            .peek(list -> System.out.println("List:" + list))
            .map(value -> formatInvoiceNumber(value))
            .collect(Collectors.toList()));
  }

  public static String formatInvoiceNumber(@NonNull final String invoiceNumber) {
    return Optional.of(invoiceNumber)
        .filter(value -> service.validateInvoiceNumber(value))
        .map(validInvoiceNumber ->
            Optional.of(validInvoiceNumber)
                .filter(theInvoiceNumber -> theInvoiceNumber.length() == 17)
                .or(() -> Optional.of(validInvoiceNumber)
                    .filter(theInvoiceNumber -> theInvoiceNumber.contains("-"))
                    .map(theInvoiceNumber -> theInvoiceNumber.split("-"))
                    .or(() -> Optional.of(StringUtils.leftPad(validInvoiceNumber, 15, '0'))
                        .map(theInvoiceNumber ->
                            new String[]{
                                StringUtils.left(theInvoiceNumber, 3),
                                StringUtils.mid(theInvoiceNumber, 3, 3),
                                StringUtils.right(theInvoiceNumber, 9)
                            }
                        )
                    )
                    .map(invoiceNumberParts -> String.format(
                        "%03d-%03d-%09d",
                        Short.parseShort(invoiceNumberParts[0]),
                        Short.parseShort(invoiceNumberParts[1]),
                        Integer.parseInt(invoiceNumberParts[2])
                    ))
                )
                .orElse(validInvoiceNumber)
        )
        .orElse("Couldn't format:" + invoiceNumber);
  }

}
