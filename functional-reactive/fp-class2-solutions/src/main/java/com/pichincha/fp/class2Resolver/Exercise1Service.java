package com.pichincha.fp.class2;

import java.util.Map;
import java.util.function.UnaryOperator;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Service;

@Service
public class Exercise1Service {
  public enum StringCaseEnum {
    NONE,
    LOWER,
    UPPER,
    CAPITAL
  }

  private static final Map<StringCaseEnum, UnaryOperator<String>> TRANSFORM_STRING_MAP = Map.of(
    StringCaseEnum.NONE, value -> value,
    StringCaseEnum.LOWER, String::toLowerCase,
    StringCaseEnum.UPPER, String::toUpperCase,
    StringCaseEnum.CAPITAL, value -> value.substring(0, 1).toUpperCase() + value.substring(1).toLowerCase()
  );

  @NonNull
  public String transformString1(@NonNull final String value, @NonNull final StringCaseEnum stringCase) {
    return switch (stringCase) {
      case NONE -> value;
      case LOWER -> value.toLowerCase();
      case UPPER -> value.toUpperCase();
      case CAPITAL -> value.substring(0, 1).toUpperCase() + value.substring(1).toLowerCase();
    };
  }

  @NonNull
  public String transformString2(@NonNull final String value, @NonNull final StringCaseEnum stringCase) {
    return TRANSFORM_STRING_MAP.get(stringCase).apply(value);
  }
}
