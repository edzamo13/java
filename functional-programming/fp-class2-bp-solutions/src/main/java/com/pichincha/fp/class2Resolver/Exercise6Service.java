package com.pichincha.fp.class2;

import java.util.Optional;
import java.util.regex.Pattern;
import org.apache.commons.lang3.StringUtils;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Service;

@Service
@SuppressWarnings({"java:S106", "java:S3864"})
public class Exercise6Service {
  /*
  Solo se debe utilizar Optional y operaciones de cadenas incluidas expresiones regulares para resolver el siguiente ejercicio:

  Dado que tenemos un número de factura que consiste de 3 partes:
  1 a 3 dígitos para indicar el establecimiento: mayor que cero.
  1 a 3 dígitos para indicar el punto de venta: mayor que cero.
  1 a 9 dígitos para indicar el secuencial de la factura: mayor que cero.

  Ejemplos: 1002000000003, 001002000000003, 001-002-000000003, 1-2-3 y 001-02-0003.

  Validar el número de factura que soporte los siguientes formatos:
  13 dígitos.
  15 dígitos.
  Dígitos separados por guion: establecimiento 1 a 3 dígitos, punto de venta 1 a 3 dígitos y secuencial de 1 a 9 dígitos.
  */
  private static final Pattern INVOICE_NUMBER_PATTERN = Pattern.compile("^(\\d{1,3}-\\d{1,3}-\\d{1,9}|\\d{13,15})$");

  public boolean validateInvoiceNumber(@NonNull final String invoiceNumber) {
    return INVOICE_NUMBER_PATTERN.matcher(invoiceNumber).matches()
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
          .filter(theInvoiceNumber -> Short.parseShort(StringUtils.left(theInvoiceNumber, 3)) > 0)
          .filter(theInvoiceNumber -> Short.parseShort(StringUtils.mid(theInvoiceNumber, 4, 3)) > 0)
          .filter(theInvoiceNumber -> Integer.parseInt(StringUtils.right(theInvoiceNumber, 9)) > 0)
          .map(theInvoiceNumber -> true)
      )
      .orElse(false);
  }
}
