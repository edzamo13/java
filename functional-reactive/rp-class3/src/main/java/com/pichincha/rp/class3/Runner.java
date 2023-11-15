package com.pichincha.rp.class3;

import com.pichincha.rp.class3.enums.StringCaseEnum;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@SuppressWarnings("java:S106")
public class Runner implements CommandLineRunner {

  @Autowired
  private ExampleService exampleService;

  @Autowired
  private ExampleService1 exampleService1;

  @Override
  public void run(final String... args) {
    System.out.println("Hello World!");
    System.out.println();
    exampleService.printRightTriangle(7);

    System.out.println("Example Service 1!");
    exampleService1.processInput("hola", StringCaseEnum.UPPER)
        .doOnSuccess(result -> log.info("result: {}", result))
        .subscribe();
    System.out.println("======================");


  }
}
