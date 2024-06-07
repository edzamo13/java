package ec.udemy.section4;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerPractice {

    public static void main(String[] args) {
        //List.of(1, 2, 3); deprecate in java 11
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 19, 12);
        Consumer<Integer> consumer= e-> System.out.println(e);
        consumer.accept(56);

        printElement(list,consumer);

    }

    private static <T> void printElement(List<T> list, Consumer<T> consumer) {
        for (T t:list) {
            System.out.println(t);

        }
    }


}
