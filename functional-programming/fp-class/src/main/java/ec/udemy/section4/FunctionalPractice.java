package ec.udemy.section4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class FunctionalPractice {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("Kit", "Kat", "Shake", "Royal");
        Function<String, Integer> function = f -> f.length();
        List<Integer> newList = map(list, function);
        System.out.println(newList);
    }

    private static <T, R> List<R> map(List<T> list, Function<T, R> function) {
        List<R> rList = new ArrayList<>();
        for (T t : list) {
            System.out.println(t);
            rList.add(function.apply(t));

        }
        return rList;
    }
}
