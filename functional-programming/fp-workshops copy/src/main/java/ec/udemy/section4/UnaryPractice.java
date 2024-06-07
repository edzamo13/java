package ec.udemy.section4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.UnaryOperator;

public class UnaryPractice {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
        UnaryOperator<Integer> operator = o -> o * 100;
        List<Integer> integers = mapper(list, operator);

        System.out.println(integers);
    }

    private static <T> List<T> mapper(List<T> list, UnaryOperator<T> operator) {
        List<T> tList = new ArrayList<>();
        for (T t : list) {
            tList.add(operator.apply(t));
        }
        return tList;
    }
}
