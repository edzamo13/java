package com.pichincha.rp.class3;

import com.pichincha.rp.class3.enums.FeeEnum;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import lombok.Data;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Data
@Service
@SuppressWarnings("java:S106")
public class ExampleService2 {


  public Mono<List<FeeEnum>> getValidation(Mono<List<Integer>> listMono) {
    return listMono.map(list -> list.stream()
            .map(ExampleService2::searchTypeFee)
            .collect(Collectors.toList()))
        .log("Validation");
  }

  static FeeEnum searchTypeFee(final Integer income) {
    return Optional.of(income)
        .filter(first -> first > 100000)
        .map(firstResult -> FeeEnum.HIGH)
        .or(() -> Optional.of(income)
            .filter(second -> second >= 50000)
            .map(secondResult -> FeeEnum.MEDIUM))
        .or(() -> Optional.of(income)
            .filter(third -> third >= 0)
            .map(thirdResult -> FeeEnum.LOW))
        .orElseThrow(IllegalArgumentException::new);
  }

}
