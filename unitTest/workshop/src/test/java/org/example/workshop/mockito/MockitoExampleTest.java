package org.example.workshop.mockito;

import static org.mockito.Mockito.*;

import java.util.LinkedList;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.mockito.InOrder;

class MockitoExampleTest {
  //You can mock concrete classes, not just interfaces
  private LinkedList mockedList = mock(LinkedList.class);

  @Test
  void exampleMockito() {
    //mock creation
    List mockedList = mock(List.class);

    //using mock object
    mockedList.add("one");
    mockedList.clear();

    //verification
    verify(mockedList).add("one");
    verify(mockedList).clear();
  }

  @Test
  void someStubbing() {
    //You can mock concrete classes, not just interfaces
    LinkedList mockedList = mock(LinkedList.class);

    //stubbing
    when(mockedList.get(0)).thenReturn("first");
    when(mockedList.get(1)).thenThrow(new RuntimeException());

    //following prints "first"
    System.out.println(mockedList.get(0));

    //following throws runtime exception
    // System.out.println(mockedList.get(1));

    //following prints "null" because get(999) was not stubbed
    System.out.println(mockedList.get(999));

    //Although it is possible to verify a stubbed invocation, usually it's just redundant
    //If your code cares what get(0) returns, then something else breaks (often even before verify() gets executed).
    //If your code doesn't care what get(0) returns, then it should not be stubbed.
    verify(mockedList).get(0);

  }

  @Test
  void argumentMatchers() {

    //stubbing using built-in anyInt() argument matcher
    when(mockedList.get(anyInt())).thenReturn("element");

    //stubbing using custom matcher (let's say isValid() returns your own matcher implementation):
   // when(mockedList.contains(argThat(isValid()))).thenReturn(true);

    //following prints "element"
    System.out.println(mockedList.get(999));

    //you can also verify using an argument matcher
    verify(mockedList).get(anyInt());

    //argument matchers can also be written as Java 8 Lambdas
    //verify(mockedList).add(argThat(someString -> someString.length() > 5));

  }

  @Test
  void verificationOrder(){
    // A. Single mock whose methods must be invoked in a particular order
    List singleMock = mock(List.class);

    //using a single mock
    singleMock.add("was added first");
    singleMock.add("was added second");

    //create an inOrder verifier for a single mock
    InOrder inOrder = inOrder(singleMock);

    //following will make sure that add is first called with "was added first", then with "was added second"
    inOrder.verify(singleMock).add("was added first");
    inOrder.verify(singleMock).add("was added second");

    // B. Multiple mocks that must be used in a particular order
    List firstMock = mock(List.class);
    List secondMock = mock(List.class);

    //using mocks
    firstMock.add("was called first");
    secondMock.add("was called second");

    //create inOrder object passing any mocks that need to be verified in order
    InOrder inOrderTwo = inOrder(firstMock, secondMock);

    //following will make sure that firstMock was called before secondMock
    inOrderTwo.verify(firstMock).add("was called first");
    inOrderTwo.verify(secondMock).add("was called second");
  }

}