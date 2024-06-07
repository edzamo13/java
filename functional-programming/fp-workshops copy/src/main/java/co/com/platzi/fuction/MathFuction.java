package co.com.platzi.fuction;

import java.util.function.Function;

public class MathFuction {

    public static void main(String[] args) {
        Function<Integer, Integer> square= new Function<Integer, Integer>() {
            @Override
            public Integer apply(Integer value) {
                return value*value;
            }
        };

        System.out.println("Value : "+square.apply(3));
    }
}
