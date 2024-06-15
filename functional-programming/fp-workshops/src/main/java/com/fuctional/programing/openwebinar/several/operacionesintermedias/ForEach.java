package com.fuctional.programing.openwebinar.several.operacionesintermedias;

import com.fuctional.programing.openwebinar.dto.Product;
import java.util.ArrayList;
import java.util.List;

public class ForEach {

  public static void main(String[] args) {

    List<Product> products = new ArrayList<>();
    products.add(new Product("1", "product1", 9.99, true));
    products.add(new Product("2", "product2", 19.99, true));
    products.add(new Product("3", "product3", 29.99, true));
    ;
    products.add(new Product("4", "product4", 39.99, true));
    products.add(new Product("5", "product5", 49.99, true));
    products.stream()
        .filter(product -> product.getPrice() > 10.0)
        .forEach(product -> product.setPrice(product.getPrice() + product.getPrice() * 0.21));

    System.out.println("Inmutable" + products);
  }
}
