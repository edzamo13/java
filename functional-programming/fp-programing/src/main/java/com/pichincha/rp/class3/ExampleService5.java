package com.pichincha.rp.class3;

import java.util.Collections;
import java.util.stream.IntStream;
import lombok.Data;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Data
@Service
@SuppressWarnings("java:S106")
public class ExampleService5 {


  public void printTriangleTwo(final int size) {
    Mono.just(IntStream.rangeClosed(1, size))
        .map(intStream -> {
          intStream.forEach(i -> {
            Collections.nCopies(i, i).forEach(System.out::print);
            System.out.println();
          });
          return intStream;
        })
        .subscribe();
  }

}
