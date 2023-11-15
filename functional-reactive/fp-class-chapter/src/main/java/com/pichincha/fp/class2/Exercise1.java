package com.pichincha.fp.class2;


import java.util.EnumSet;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Service;

@Service
@SuppressWarnings("java:S106")
public class Exercise1 {

  static enum StringCaseEnum {
    NONE,
    LOWER,
    UPPER,
    CAPITAL
  }

  private final Optional<EnumSet<StringCaseEnum>> optionalCaseEnum;

  public Exercise1(Optional<EnumSet<StringCaseEnum>> optionalCaseEnum) {
    optionalCaseEnum = Optional.of(
        EnumSet.of(StringCaseEnum.NONE, StringCaseEnum.LOWER, StringCaseEnum.UPPER,
            StringCaseEnum.CAPITAL));
    this.optionalCaseEnum = optionalCaseEnum;
  }


  public String transformStringWithOptional(@NonNull final String input,
      @NonNull final StringCaseEnum stringCase) {
    Optional<EnumSet<StringCaseEnum>> optionalCaseEnum;
    optionalCaseEnum = Optional.of(
        EnumSet.of(StringCaseEnum.NONE, StringCaseEnum.LOWER, StringCaseEnum.UPPER,
            StringCaseEnum.CAPITAL));

    return optionalCaseEnum.map(
            enumSet -> enumSet.stream()
                .filter(enumValue -> enumValue.equals(stringCase))
                .map(enumValue -> {
                  Map<StringCaseEnum, Function<String, String>> transformationMap = createTransformationMap();
                  Function<String, String> transformation = transformationMap.get(stringCase);
                  return transformation.apply(input);
                })).get()
        .collect(Collectors.joining());


  }


  private static Map<StringCaseEnum, Function<String, String>> createTransformationMap() {
    Map<StringCaseEnum, Function<String, String>> transformationMap = Map.of(
        StringCaseEnum.NONE, Function.identity(),
        StringCaseEnum.LOWER, String::toLowerCase,
        StringCaseEnum.UPPER, String::toUpperCase,
        StringCaseEnum.CAPITAL,
        value -> value.substring(0, 1).toUpperCase() + value.substring(1).toLowerCase()
    );
    System.out.println("transformationMap: " + transformationMap);
    return transformationMap;
  }

}
