package com.fuctional.programing.openwebinar.several.operacionesterminales;

import com.fuctional.programing.openwebinar.dto.Product;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ToList {
  public static void main(String[] args) {

    List<Product> products = new ArrayList<>();
    products.add(new Product("1","product1", 9.99,true));
    products.add(new Product("2","product2", 19.99,true));
    products.add(new Product("3","product3", 29.99,true));
    products.add(new Product("4","product4", 39.99,true));
    products.add(new Product("5","product5", 49.99,true));

    List<Double> prices = products.stream()
        .map(Product::getPrice)
        .filter(price -> price > 10.0)
        .collect(Collectors.toList());

    System.out.println(prices);

    List<Double> prices2 = products.stream()
        .map(Product::getPrice)
        .filter(price -> price > 10.0)
        .toList();

    System.out.println(prices);

  }
}
