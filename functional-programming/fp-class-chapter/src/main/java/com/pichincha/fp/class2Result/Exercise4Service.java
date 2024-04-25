package com.pichincha.fp.class2Result;

import java.util.stream.IntStream;
import org.springframework.stereotype.Service;

@Service
@SuppressWarnings({"java:S106", "java:S3864"})
public class Exercise4Service {
  public int factorial1(final int n) {
    int fact = 1;
    for (int i = 1; i <= n; ++i) {
      fact = fact * i;
    }
    return fact;
  }

  public int factorial2(final int n) {
    return IntStream.rangeClosed(1, n).reduce(1, (fact, i) -> fact * i);
  }
}
