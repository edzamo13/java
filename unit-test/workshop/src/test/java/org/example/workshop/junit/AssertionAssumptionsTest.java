package org.example.workshop.junit;

import static java.time.Duration.ofSeconds;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTimeout;

import org.example.workshop.junit.dto.Person;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AssertionAssumptionsTest {

  Person person;

  @BeforeEach
  void init() {
    person = Person.builder()
        .name("name")
        .lastName("lastName")
        .age(40)
        .build();

  }

  @Test
  void exceptionTesting() {
     //Throwable exception = Assertions.assertThrows(IllegalArgumentException.class,
    //    () -> person.setAge("34"));
    //assertEquals("Age must be an Integer.", exception.getMessage());
  }

  @Test
  void groupAssertions() {

    assertAll("person name",
        () -> assertEquals("name", person.getName()),
        () -> assertEquals("lastName", person.getLastName()));
  }

  @Test
  void timeoutNotExceeded() {
   // assertTimeout(ofMinutes(1), () -> service.doBackup());
  }


  // if you have to check a return value
  @Test
  void timeoutNotExceededWithResult() {
   /*
    String actualResult = assertTimeout(ofSeconds(1), () -> {
      return restService.request(request);
    });
    assertEquals(200, request.getStatus());*/
  }

}
