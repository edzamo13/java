package ec.udemy.section1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;

public class ImperativeVsDeclarative {
/*
    // Imperative
    public static void main(String[] args) {
        int sumIfEvens = 0;
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) {
                sumIfEvens = sumIfEvens + i;
            }
        }
        System.out.println(sumIfEvens);

    }

    public static void main(String[] args) {
        int sumIfEvens = 0;
           sumIfEvens = IntStream.rangeClosed(0, 100)
                .filter(n -> n % 2 == 0)
                .reduce((x, y) -> x + y)
                .getAsInt();
        System.out.println(sumIfEvens);

    }
*/


    public static void main(String[] args) {
        Random rand = new Random();
        List<Integer> list = new ArrayList<Integer>();           // empty list
        for (int i = 0; i < 2048; i++) list.add(rand.nextInt()); // populate it
    }

}
