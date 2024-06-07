package com.pichincha.rp.class3;

import com.pichincha.rp.class3.enums.StringCaseEnum;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Slf4j
@Component
@SuppressWarnings("java:S106")
public class Runner implements CommandLineRunner {

  @Autowired
  private ExampleService exampleService;

  @Autowired
  private ExampleService1 exampleService1;
  @Autowired
  private ExampleService2 service2;
  @Autowired
  private ExampleService3 service3;
  @Autowired
  private ExampleService4 service4;
  @Autowired
  private ExampleService5 service5;
  @Autowired
  private ExampleService6 service6;
  @Autowired
  private ExampleService7 service7;
  @Autowired
  private ExampleService8 service8;

  @Override
  public void run(final String... args) {
    System.out.println("Hello World!");
    System.out.println();
    exampleService.printRightTriangle(7);
    System.out.println("======================");
    System.out.println("Example Service 1!");
    exampleService1.processInput("hola", StringCaseEnum.UPPER)
        .doOnSuccess(result -> log.info("result: {}", result))
        .subscribe();
    System.out.println("Example Service 2!");
    service2.getValidation(Mono.just(Arrays.asList(100001, 50000, 200, 0)))
        .doOnSuccess(result -> log.info("Validation: {}", result))
        .subscribe();
    System.out.println("======================");
    System.out.println("Example Service 3!");
    service3.printTriangle(5);
    System.out.println("======================");

    System.out.println("Example Service 4!");
    service4.calculateFactorial(5);
    System.out.println("======================");
    System.out.println("Example Service 5!");
    service5.printTriangleTwo(5);
    System.out.println("======================");
    System.out.println("Example Service 6!");
    service6.printValidation(Arrays.asList(
            "1",
            "0-1-1",
            "1001900000041",
            "1-002-000000031",
            "001002900000032",
            "001-002-000000033",
            "1-2-4124",
            "1-2-900004420",
            "1-002-4819",
            "001-1-000000039",
            "001-001-40",
            "001002000000030"
        ))
        .doOnNext(response -> System.out.println("response :" + response))
        .subscribe();
    System.out.println("======================");
    System.out.println("Example Service 7!");
    service7.printValidation(Arrays.asList(
            "1",
            "0-1-1",
            "1001900000041",
            "1-002-000000031",
            "001002900000032",
            "001-002-000000033",
            "1-2-4124",
            "1-2-900004420",
            "1-002-4819",
            "001-1-000000039",
            "001-001-40",
            "001002000000030"
        ))
        .doOnNext(response -> System.out.println("response :" + response))
        .subscribe();
    System.out.println("======================");

    System.out.println("Example Service 8!");
    service8.calculate(IntStream.range(1, 100)
        .boxed()
        .collect(Collectors.toList()));
    System.out.println("======================");


  }
}
