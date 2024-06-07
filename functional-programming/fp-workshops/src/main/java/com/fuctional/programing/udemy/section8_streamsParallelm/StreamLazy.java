package com.reactive.programming.udemy.reactive.section8_streamsParallelm;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamLazy {

    public static void main(String[] args) {

        List<Book> books = new ArrayList<>();

        books.add(new Book("The Alchemist", "Paulo Coelho", "Adventure", 4.408789797));
        books.add(new Book("The Notebook", "Nicholas Sparks", "Romance", 4.10));
        books.add(new Book("Horror Cocktail", "Robert Bloch", "Horror", 2.67));
        books.add(new Book("House of Leaves", "Mark Z. Danielewski", "Horror", 4.10908908));


        Stream<Book> bookStream = books.stream()
                .filter(book -> book.getGenre().equalsIgnoreCase("Horror"))
                .peek(book -> System.out.println("peek Filtered book:" + book))
                .filter(book -> book.getRating() > 3);
        System.out.println("Filtering Done!..");

        collect(bookStream);

    }

    private static void collect(Stream<Book> bookStream) {
        List<Book> books= bookStream.collect(Collectors.toList());
        books.forEach(System.out::println);
    }

}
