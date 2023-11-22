package com.pichincha.fp.class2Result;

import java.util.Optional;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Service;

@Service
public class Exercise2Service {
  public enum FeeEnum {
    LOW,
    MEDIUM,
    HIGH
  }

  @NonNull
  public FeeEnum getFee1(final double income) {
    if (income < 0) {
      throw new IllegalArgumentException();
    }
    if (income > 1_000_000) {
      return FeeEnum.HIGH;
    }
    if (income > 500_000) {
      return FeeEnum.MEDIUM;
    }
    return FeeEnum.LOW;
  }

  @NonNull
  public FeeEnum getFee2(final double income) {
    return Optional.of(income)
      .filter(theIncome -> theIncome > 1_000_000)
      .map(theIncome -> FeeEnum.HIGH)
      .orElse(
        Optional.of(income)
          .filter(theIncome -> theIncome > 500_000)
          .map(theIncome -> FeeEnum.MEDIUM)
          .orElse(
            Optional.of(income)
              .filter(theIncome -> theIncome >= 0)
              .map(theIncome -> FeeEnum.LOW)
              .orElseThrow(IllegalArgumentException::new)
          )
      );
  }

  @NonNull
  public FeeEnum getFee3(final double income) {
    return Optional.of(income)
      .filter(theIncome -> theIncome > 1_000_000)
      .map(theIncome -> FeeEnum.HIGH)
      .orElseGet(() ->
        Optional.of(income)
          .filter(theIncome -> theIncome > 500_000)
          .map(theIncome -> FeeEnum.MEDIUM)
          .orElseGet(() ->
            Optional.of(income)
              .filter(theIncome -> theIncome >= 0)
              .map(theIncome -> FeeEnum.LOW)
              .orElseThrow(IllegalArgumentException::new)
          )
      );
  }

  @NonNull
  public FeeEnum getFee4(final double income) {
    return Optional.of(income)
      .filter(theIncome -> theIncome > 1_000_000)
      .map(theIncome -> FeeEnum.HIGH)
      .or(() ->
        Optional.of(income)
          .filter(theIncome -> theIncome > 500_000)
          .map(theIncome -> FeeEnum.MEDIUM)
      )
      .or(() ->
        Optional.of(income)
          .filter(theIncome -> theIncome >= 0)
          .map(theIncome -> FeeEnum.LOW)
      )
      .orElseThrow(IllegalArgumentException::new);
  }
}
