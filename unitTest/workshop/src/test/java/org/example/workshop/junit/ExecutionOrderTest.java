package org.example.workshop.junit;


import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(OrderAnnotation.class)
class ExecutionOrderTest {

  OrderAnnotationExample order;

  @BeforeEach
  void start() {
    order = new OrderAnnotationExample();

  }

  @Test
  @Order(1)
  void firstOne() {

  assertEquals(3, order.subtract(5, 2));

  }

  @Test
  @Order(2)
  void secondOne() {
    order.add(3, 6);

  }

}


