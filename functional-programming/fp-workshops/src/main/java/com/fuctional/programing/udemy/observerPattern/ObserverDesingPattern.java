package com.reactive.programming.udemy.reactive.observerPattern;

public class ObserverDesingPattern {
    public static void main(String[] args) {
        Book book= new Book("Goosebumps","Horror","XyZ",200,"SoldOut ");
        EndUser endUser=  new EndUser("Boob",book);
        EndUser endUser1= new EndUser("Rob" ,book);

        System.out.println(book.getInStock());
        book.setInStock("In Stock");
    }

}
