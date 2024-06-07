package com.pichincha.rp.class3;

import com.pichincha.rp.class3.enums.FeeEnum;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import lombok.Data;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Data
@Service
@SuppressWarnings("java:S106")
public class ExampleService3 {


  public void printTriangle(final int size) {
    Mono.just(IntStream.range(1, size))
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
