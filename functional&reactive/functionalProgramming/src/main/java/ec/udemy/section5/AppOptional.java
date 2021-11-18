package ec.udemy.section5;


import java.util.Optional;
import java.util.stream.Stream;

public class AppOptional {
    public static void main(String[] args) {
        //  introducingOptional();
        //   operationWithOptional();
        moreOperationWithOptional();
    }


    private static void introducingOptional() {
        String val = "A string";

        Optional<String> optional = Optional.of(val);
        //System.out.println("get of Optinal:" + optional.get());
        //other form the print with optional
        optional.ifPresent(System.out::println);


        //empty
        Optional<Integer> empty = Optional.empty();
        System.out.println("get of Optinal is empty: " + empty.isPresent());

        //nullable

        Optional<String> nullable = Optional.ofNullable(val);
        System.out.println("get of Optinal is nullable:" + nullable.get());
        Optional<String> emptyOptional = Optional.ofNullable(null);

        //   System.out.println("get of Optinal is emptyOptional:" + emptyOptional.get());

        //When you need return a value and you don't know if exist, you can use isPresent()
        Optional<Integer> present = Optional.empty();
        System.out.println("get of Optinal is empty: " + present.isPresent());
        System.out.println("get of optional orElse :" + present.orElse(100));
        //with orElseGet you can do, the that you want show
        System.out.println("get of optional orElseGet :" + present.orElseGet(() -> 1));
        //with this option you can throw a exception
        System.out.println("get of optional orElseThrow : " + present.orElseThrow(() -> new IllegalArgumentException()));

    }

    private static void operationWithOptional() {
        Optional<String> optional = Optional.of("Hi word ");
        //map
        Optional<String> optionalChange = optional.map(value -> "hi word change with map");
        optionalChange.ifPresent(imp -> System.out.println("Simple lambda: " + imp));

        //System.out.println("Optional using map: " + optionalChange.get());


        Optional<String> optionalEmpty = Optional.empty();
        Optional<String> optionalOrElse = Optional.of(optionalEmpty.map(value -> "Hi word").orElse("Hi word orElse"));
        System.out.println("Optional using map orElse: " + optionalOrElse.get());

        Optional<String> optionalEqual = optionalOrElse.filter(value -> value.equalsIgnoreCase("HI word orelse"));
        System.out.println("Optional using filter: " + optionalEqual.get());

        //flapMap
        Optional<String> optionalEmptyTmp = Optional.empty();
        Optional<Integer> integer = Optional.of(
                        optionalEmptyTmp.map(e -> "Value x")
                                .orElse("Optional")
                )
                .flatMap(value -> Optional.of(4));
        System.out.println("Optional using flapMap , transform to Integer: " + integer.get());


    }

    private static void moreOperationWithOptional() {
        Optional<String> optional = Optional.of("value x");
        //optional.ifPresent(System.out::println);
        optional.ifPresent(print -> System.out.println("Print with lambda short " + print));

        //ifPresentOrElse
        //  Optional<String> optionalEmpty= Optional.empty();
        // Optional.empty().ifPresentOrElse(System.out::println, ()-> System.out.println("Value is absent"));

        //stream
        /**
         Stream<String> stream= optional.stream();
         Optional.empty().stream().forEach(System.out::println);
         */

        //  Optional.empty().or(()-> Optional.of("value")).ifPresent(System.out::println);

//hascode
        System.out.println(optional.hashCode());
    }
}
