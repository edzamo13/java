package hackerrank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BasicPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();

        solutionOne(A);
        solutionPalindrome(A);

    }

    private static void solutionOne(String A) {
        List<String> left = new ArrayList<>();
        for (int i = A.length(); i > 0; i--) {
            left.add(A.substring(i - 1, i));
        }
        System.out.println(left.stream().collect(Collectors.joining()).equals(A) ? "Yes" : "No");
    }

    private static void solutionPalindrome(String A) {
        System.out.println(A.equals(new StringBuilder(A).reverse().toString()) ? "Yes" : "NO");
    }

}
