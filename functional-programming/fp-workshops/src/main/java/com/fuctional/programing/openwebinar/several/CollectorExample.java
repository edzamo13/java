package com.fuctional.programing.openwebinar.several;

import com.fuctional.programing.openwebinar.dto.Product;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class CollectorExample {

  public static void main(String[] args) {

    Set<Product> productSet = getProducts().stream()
        .filter(product -> product.getPrice() > 40)
        .collect(Collectors.toSet());
    System.out.println("productSet:" + productSet);
    Set<Double> doubleSet = getProducts().stream()
        .map(Product::getPrice)
        .filter(product -> product > 40)
        .collect(Collectors.toSet());
    System.out.println("doubleSet:" + doubleSet);
    String nameProducts = getProducts().stream()
        .filter(product -> product.getPrice() > 40)
        .map(Product::getName)
        .collect(Collectors.joining(","));
    System.out.println("Collectors joining to name: " + nameProducts);

    DoubleSummaryStatistics doubleSummaryStatistics = getProducts().stream()
        .collect(Collectors.summarizingDouble(Product::getPrice));

    System.out.println("summarizingDouble to count: " + doubleSummaryStatistics.getCount());
    System.out.println("summarizingDouble to min: " + doubleSummaryStatistics.getMin());
    System.out.println("summarizingDouble to average: " + doubleSummaryStatistics.getAverage());
    System.out.println("summarizingDouble to average: " + doubleSummaryStatistics.getSum());

  }

  private static List<Product> getProducts() {
    return List.of(new Product("1", "product1", 40.0, false),
        new Product("2", "product2", 50.0, false),
        new Product("3", "product3", 60.0, false),
        new Product("4", "product4", 100.0, false));


  }

}
