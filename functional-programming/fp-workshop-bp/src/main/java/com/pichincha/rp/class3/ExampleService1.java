package com.pichincha.rp.class3;

import com.pichincha.rp.class3.enums.StringCaseEnum;
import lombok.Data;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Data
@Service
@SuppressWarnings("java:S106")
public class ExampleService1 {

  public Mono<String> processInput(final String input, final StringCaseEnum caseEnum) {
    return Mono.defer(() -> {
      switch (caseEnum) {
        case NONE -> {
          return Mono.just(input);
        }
        case LOWER -> {
          return Mono.just(input.toLowerCase());
        }
        case UPPER -> {
          return Mono.just(input.toUpperCase());
        }
        case CAPITAL -> {
          return Mono.just(input.substring(0, 1).toUpperCase() + input.substring(1).toLowerCase());
        }
        default -> {
          return Mono.error(new Throwable("error"));
        }
      }
    });
  }



}
