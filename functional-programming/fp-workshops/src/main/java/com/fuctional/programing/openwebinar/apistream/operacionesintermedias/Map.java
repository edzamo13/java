package com.fuctional.programing.openwebinar.apistream.operacionesintermedias;

import com.fuctional.programing.openwebinar.dto.Product;
import java.util.ArrayList;
import java.util.List;

public class Map {
  public static void main(String[] args) {

    List<String> texts = new ArrayList<>();
    texts.add("ddd2");
    texts.add("aaa2");
    texts.add("bbb1");
    texts.add("aaa1");
    texts.add("bbb3");
    texts.add("ccc");
    texts.add("bbb2");

//        texts.stream()
//                .map(text -> text.length())
//                .forEach(System.out::println);

    texts.stream()
        .map(String::length)
        .forEach(System.out::println);

    List<Product> products = new ArrayList<>();
    products.add(new Product("1","product1", 9.99,true));
    products.add(new Product("2","product2", 19.99,true));
    products.add(new Product("3","product3", 29.99,true));
    products.add(new Product("4","product4", 39.99,true));
    products.add(new Product("5","product5", 49.99,true));

    products.stream()
        .map(Product::getPrice)
        .filter(price -> price > 10.0)
        .forEach(System.out::println);


  }
}
