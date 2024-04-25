package com.pichincha.fp.class2;

import com.pichincha.fp.class2.Exercise1.StringCaseEnum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@SuppressWarnings("java:S106")
public class Runner implements CommandLineRunner {
  @Autowired
  private ExampleService exampleService;
  @Autowired
  private Exercise1 exercise1Service;
  @Autowired
  private Exercise2 exercise2Service;
  @Autowired
  private Exercise3 exercise3Service;

  @Override
  public void run(final String... args) {
    System.out.println("Hello World!");
    System.out.println();
   // exampleService.printRightTriangle(7);
    System.out.println("===========================");
    System.out.println("Exercise 1");
    exercise1Service.transformStringWithOptional("hola", StringCaseEnum.UPPER);
    System.out.println("===========================");
    exercise2Service.getFeeWithOptional();
    exercise3Service.printRightTriangle(5);
  }
}
