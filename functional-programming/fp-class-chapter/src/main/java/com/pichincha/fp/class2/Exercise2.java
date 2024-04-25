package com.pichincha.fp.class2;


import java.util.EnumSet;
import java.util.Optional;
import org.springframework.stereotype.Service;

@Service
@SuppressWarnings("java:S106")
public class Exercise2 {

  static enum FeeEnum {
    NONE,
    LOW,
    MEDIUM,
    HIGH
  }


  public String getFeeWithOptional() {
    Optional<EnumSet<FeeEnum>> feeEnums = Optional.of(
        EnumSet.of(FeeEnum.NONE, FeeEnum.LOW, FeeEnum.MEDIUM,
            FeeEnum.HIGH));

    Optional<Integer> optional1 = Optional.of(0);
    Optional<Integer> optional2 = Optional.of(1_000_000);
    Optional<Integer> optional3 = Optional.of(500_000);

    optional1.ifPresent(integer -> {
      System.out.println("integer"+integer);
    //  throw new IllegalArgumentException();
    }
    );
    return "";
  }
}
