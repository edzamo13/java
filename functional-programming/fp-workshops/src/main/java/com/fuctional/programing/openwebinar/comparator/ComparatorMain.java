package com.fuctional.programing.openwebinar.comparator;

import com.fuctional.programing.openwebinar.dto.Product;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

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
        "Compare 1: " + productComparator.compare(product1, product2) + " Second " + productComparatorReference.compare(
            product1, product2));
    System.out.println("List start:" + getProducts());
    referenceComparator(productComparatorReference);
    referenceComparatorWithCollector(productComparatorReference);
    reverseComparator(productComparatorReference);

  }

  private static void referenceComparator(Comparator<Product> productComparatorReference) {
    //using ArrayList because is modificable
    List<Product> productList = getProducts();
    productList.sort(productComparatorReference);
    System.out.println("Using comparator with Reference in an Object  sort array :" + productList);
  }

  private static void referenceComparatorWithCollector(Comparator<Product> productComparatorReference) {
    //using ArrayList because is modificable
    List<Product> productList = getProducts();
    Collections.sort(productList,productComparatorReference);
    System.out.println("Using comparator with Reference in an Object  using Collection :" + productList);
  }

  private static void reverseComparator(Comparator<Product> productComparatorReference) {
    List<Product> productList = getProducts();
    productList.sort(productComparatorReference.reversed());
    System.out.println("Using comparator with Reference in an Object  reversed :" + productList);
  }

  private static List<Product> getProducts() {
    List<Product> productList = new ArrayList<>(List.of(new Product("1", "product1", 50.0, false),
        new Product("2", "product2", 9.0, false),
        new Product("3", "product3", 5.0, false),
        new Product("4", "product4", 39.0, false),
        new Product("5", "product5", 19.0, false)));
    return productList;
  }
}