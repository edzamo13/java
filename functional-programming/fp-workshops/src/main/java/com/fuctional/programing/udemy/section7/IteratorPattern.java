package com.reactive.programming.udemy.reactive.section7;


import com.reactive.programming.udemy.reactive.section7.exampleMethod.MyArrayList;

/**
 * The iterator design pattern,enables to get a way to access the elements
 * of a collection object in sequential manner without any need to know
 * its internal presentation
 */

public class IteratorPattern {

    public static void main(String[] args) {
        MyArrayList myArrayList = new MyArrayList(new Object[] {1, 2, 3, 4, 5});
        myArrayList.forEach(System.out::println);
    }
}
