package oreilly;

public class Example {

    public static void main(String[] args) {
        firstExercise();
        secondExercise();

    }

    private final static void firstExercise() {
        int i = 99;
        System.out.println(++i);

        int a = 99;
        System.out.println(a++);

        int x = 10;
        int y = 0;
        y += x;
        y += x;
        System.out.println(y);
    }

    private final static void secondExercise() {
        int[] ia = {0, 1, 2, 3, 4};
        int idx = (int) (Math.random() * 101) * -50;
        System.out.println(idx);
        System.out.println(ia[idx % ia.length]);
    }
}