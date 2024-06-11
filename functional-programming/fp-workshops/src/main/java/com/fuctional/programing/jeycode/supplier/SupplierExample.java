package com.fuctional.programing.jeycode.supplier;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Supplier;

public class SupplierExample {

  public static void main(String[] args) {

    Supplier<LocalDate> localDateSupplier = LocalDate::now;

    System.out.println("get Date: " + localDateSupplier.get());
    var random = new Random();
    usingSupplier(random::nextInt);
    List<String> names= new ArrayList<>();
    names.add("Ewin");
    names.add("Paula");
    usingSupplier(names::toString);
  }

  private static <T> void usingSupplier(Supplier<T> supplier) {
    System.out.println("in using Supplier");
    System.out.println("get Supplier:" + supplier.get());

  }

}
