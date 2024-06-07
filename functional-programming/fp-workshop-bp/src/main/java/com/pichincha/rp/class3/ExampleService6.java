package com.pichincha.rp.class3;

import java.util.List;
import java.util.Optional;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import lombok.Data;
import org.apache.commons.lang3.StringUtils;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;


@Data
@Service
@SuppressWarnings({"java:S106", "java:S3864"})
public class ExampleService6 {


  private static final Pattern INVOICE_NUMBER_PATTERN = Pattern.compile(
      "^(\\d{1,3}-\\d{1,3}-\\d{1,9}|\\d{13,15})$");

  public static Flux<List<Boolean>> printValidation(List<String> invoices) {
    return Flux.just(invoices)
        .map(strings -> strings.stream()
            .peek(list -> System.out.println("List:" + list))
            .map(value -> validateInvoiceNumber(value))
            .collect(Collectors.toList()));
  }

  static boolean validateInvoiceNumber(@NonNull final String invoiceNumber) {
    return INVOICE_NUMBER_PATTERN
        .matcher(invoiceNumber)
        .matches()
        && Optional.of(invoiceNumber)
        .filter(theInvoiceNumber -> theInvoiceNumber.contains("-"))
        .map(theInvoiceNumber -> theInvoiceNumber.split("-"))
        .map(invoiceNumberParts ->
            Short.parseShort(invoiceNumberParts[0]) > 0
                && Short.parseShort(invoiceNumberParts[1]) > 0
                && Integer.parseInt(invoiceNumberParts[2]) > 0
        )
        .or(() ->
            Optional.of(StringUtils.leftPad(invoiceNumber, 15, '0'))
                .filter(
                    theInvoiceNumber -> Short.parseShort(StringUtils.left(theInvoiceNumber, 3)) > 0)
                .filter(
                    theInvoiceNumber -> Short.parseShort(StringUtils.mid(theInvoiceNumber, 4, 3))
                        > 0)
                .filter(theInvoiceNumber -> Integer.parseInt(StringUtils.right(theInvoiceNumber, 9))
                    > 0)
                .map(theInvoiceNumber -> true)
        )
        .orElse(false);
  }

}
