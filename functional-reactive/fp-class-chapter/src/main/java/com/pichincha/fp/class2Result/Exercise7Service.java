package com.pichincha.fp.class2Result;

import java.util.Optional;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@SuppressWarnings({"java:S106", "java:S3864"})
public class Exercise7Service {
  /*
  Solo se debe utilizar Optional y operaciones de cadenas incluidas expresiones regulares para resolver el siguiente ejercicio:

  Dado que tenemos un número de factura que consiste de 3 partes:
  1 a 3 dígitos para indicar el establecimiento: mayor que cero.
  1 a 3 dígitos para indicar el punto de venta: mayor que cero.
  1 a 9 dígitos para indicar el secuencial de la factura: mayor que cero.

  Ejemplos: 1002000000003, 001002000000003, 001-002-000000003, 1-2-3 y 001-02-0003.

  Formatear el número de factura con el formato: 999-999-999999999.

  En caso de ser un número de factura inválido lanzar una excepción.
*/
  private final Exercise6Service exercise6Service;

  public String formatInvoiceNumber(@NonNull final String invoiceNumber) {
    return Optional.of(invoiceNumber)
      .filter(exercise6Service::validateInvoiceNumber)
      .map(validInvoiceNumber ->
        Optional.of(validInvoiceNumber).filter(theInvoiceNumber -> theInvoiceNumber.length() == 17)
          .or(() -> Optional.of(validInvoiceNumber)
            .filter(theInvoiceNumber -> theInvoiceNumber.contains("-"))
            .map(theInvoiceNumber -> theInvoiceNumber.split("-"))
            .or(() -> Optional.of(StringUtils.leftPad(validInvoiceNumber, 15, '0'))
              .map(theInvoiceNumber ->
                new String[] {
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
      .orElseThrow(IllegalArgumentException::new);
  }
}
