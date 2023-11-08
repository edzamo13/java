package ec.udemy.section8_streamsParallelm;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.*;

public class StreamNumeric {

    public static void main(String[] args) {

        List<Book> books = new ArrayList<>();

        books.add(new Book("The Alchemist", "Paulo Coelho", "Adventure", 4.408789797));
        books.add(new Book("The Notebook", "Nicholas Sparks", "Romance", 4.10));
        books.add(new Book("Horror Cocktail", "Robert Bloch", "Horror", 2.67));
        books.add(new Book("House of Leaves", "Mark Z. Danielewski", "Horror", 4.10908908));


    OptionalDouble optionalDouble= books.stream()
              .map(book -> book.getRating())
              .mapToDouble(value -> value)
              .average();
        System.out.println(optionalDouble.getAsDouble());

        IntStream intStream= IntStream.of(1,2,3,4,5);
        DoubleStream doubleStream= DoubleStream.of(1,2,3,4,5);
        LongStream longStream= LongStream.of(1,2,3,4,5);

        Stream<Integer> boxInter = intStream.boxed();

    }



}
