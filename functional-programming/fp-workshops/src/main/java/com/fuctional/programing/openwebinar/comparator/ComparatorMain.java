package com.fuctional.programing.openwebinar.comparator;

import com.fuctional.programing.openwebinar.dto.Product;
import java.util.Comparator;

public class ComparatorMain {

  public static void main(String[] args) {
    Comparator<Integer> comparator1 = (num1, num2) -> num1.compareTo(num2);
    Comparator<Integer> comparatorForReference = Integer::compareTo;
// reposo -1 0 1

    System.out.println("First : " + comparator1.compare(10, 20) + " Second : " + comparatorForReference.compare(90, 9));

    Product product1 = new Product("1", "product1", 50.0, false);
    Product product2 = new Product("2", "product2", 50.0, false);

    Comparator<Product> productComparator = (p1, p2) -> p1.getPrice().compareTo(p2.getPrice());
    Comparator<Product> productComparatorReference = Comparator.comparing(Product::getPrice);
    System.out.println(
        "Compare 1: " + productComparator.compare(product1, product2) + " Second " + productComparatorReference.compare(product1, product2));


  }
}
