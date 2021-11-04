package ec.udemy.section4;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerPracticeMethodReference {

    public static void main(String[] args) {
        //List.of(1, 2, 3); deprecate in java 11
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 19, 12);
        list.forEach(System.out::println);

        list.stream().forEach(n-> Math.pow(n,2));









    }




}
