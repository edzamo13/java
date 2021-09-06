package apiStream.collectors;

import java.util.List;
import java.util.Objects;
import java.util.Random;
import java.util.stream.Collectors;

public class ExampleCollector {

    //Los collectors nos van a permitir, en una operación terminal, construir una collección mutable, el resultado de las operaciones sobre un stream.

    public static void main(String[] args) {


        Random random = new Random();
        List<Integer> integers = random.ints(0, 100).limit(20).boxed().collect(Collectors.toList());
        Long counting = integers.stream().collect(Collectors.counting());
        int summing = integers.stream().collect(Collectors.summingInt(s -> s.intValue()));
        int otherSumming = integers.stream().mapToInt(s -> s.intValue()).sum();
        String join= integers.stream().sorted().map(Objects::toString).collect(Collectors.joining(","));

        integers.forEach(System.out::println);
        System.out.println("counting :" + counting);
        System.out.println("summing :" + summing);
        System.out.println("otherSumming :" + otherSumming);
        System.out.println("joinString :" + join);
    }

}
