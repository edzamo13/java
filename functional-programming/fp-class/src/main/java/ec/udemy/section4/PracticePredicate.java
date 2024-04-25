package ec.udemy.section4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PracticePredicate {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("Basics", "", "Strong", "");
        Predicate<String> predicate = s -> !s.isEmpty();
        List<String> newList = filterList(list, predicate);
        System.out.println(newList.toString());

        Predicate<String> predicate1 = s -> s.contains("Basics");
        List<String> newListFilter = filterList(list, predicate1);
        System.out.println(newListFilter);

        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
        Predicate<Integer> predicate2 = n -> n % 2 == 0;
        List<Integer> newInteger = filterList(integers, predicate2);
        System.out.println(newInteger);


    }
/*
    private static List<String> filterList(List<String> list, Predicate<String> predicate) {
        List<String> newList = new ArrayList<>();
        for (String s : list) {
            if (predicate.test(s)){
                newList.add(s);
            }

        }

        return newList;
    }
 */

    private static <T> List<T> filterList(List<T> list, Predicate<T> predicate) {
        List<T> newList = new ArrayList<>();
        for (T s : list) {
            if (predicate.test(s)) {
                newList.add(s);
            }

        }

        return newList;
    }


}
