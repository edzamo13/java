package com.pichincha.rp.class3;

import java.util.Collections;
import java.util.stream.IntStream;
import lombok.Data;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Data
@Service
@SuppressWarnings("java:S106")
public class ExampleService4 {

  public void calculateFactorial(final int size) {
    Mono.just(IntStream.rangeClosed(1, size))
        .map(intStream -> intStream.reduce(1, (x, y) -> x * y))
        .doOnSuccess(response -> System.out.println("factorial is: " + response))
        .subscribe();
  }

}
