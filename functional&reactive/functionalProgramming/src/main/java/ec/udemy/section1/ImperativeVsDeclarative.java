package ec.udemy.section1;

import java.util.stream.IntStream;

public class ImperativeVsDeclarative {

    // Imperative

    public static void main(String[] args) {
        int sumIfEvens = 0;
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) {
                sumIfEvens = sumIfEvens + i;

            }
        }
        System.out.println(sumIfEvens);

        //Declarative

        sumIfEvens = IntStream.rangeClosed(0, 100)
                .filter(n -> n % 2 == 0)
                .reduce((x, y) -> x + y)
                .getAsInt();

        System.out.println(sumIfEvens);

    }


}
