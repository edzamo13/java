package org.example.workshop.junit.vogella;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

class CalculatorTest {

  private Calculator calculator;

  @BeforeEach
  void init() {
    calculator = new Calculator();

  }

  @Test // @Test defines a test method
  @DisplayName("Simple multiplication should work")//	@DisplayName can be used to define the name of the test which is displayed to the user
  void testMultiply() {
    assertEquals(20, calculator.multiply(4, 5), "Regular multiplication should work");
  }

  @RepeatedTest(5)//@RepeatedTest defines that this test method will be executed multiple times, in this example 5 times
  @DisplayName("Ensure correct hadling of zeero")
  void testMultiplyWithZero(){
    assertEquals(0, calculator.multiply(0,5));
  }

  @Test
  void multiplyException() {
    assertThrows(IllegalArgumentException.class, () -> calculator.multiplyException(1000, 5));
  }
}