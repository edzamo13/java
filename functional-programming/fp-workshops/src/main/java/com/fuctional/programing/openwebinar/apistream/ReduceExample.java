package com.fuctional.programing.openwebinar.apistream;

import com.fuctional.programing.openwebinar.dto.Product;
import java.util.List;

public class ReduceExample {

  public static void main(String[] args) {

    var usingDeclarative = getProducts().stream()
        .map(Product::getPrice)
        .reduce(0.0, (num1, num2) -> num1 + num2);

    var usingLambda = getProducts().stream()
        .map(Product::getPrice)
        .reduce(0.0, Double::sum);

    System.out.println("declarative " + usingDeclarative + " lambda " + usingLambda);
  }

  private static List<Product> getProducts() {
    return List.of(new Product("1", "product1", 40.0, false),
        new Product("2", "product2", 50.0, false),
        new Product("3", "product3", 60.0, false),
        new Product("4", "product4", 100.0, false));
  }
}
