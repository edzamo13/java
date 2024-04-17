package hackerrank;

import java.util.Scanner;

public class JavaSubstring {


    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        String cad= scanner.nextLine();
        int star= scanner.nextInt();
        int end= scanner.nextInt();
        System.out.println(cad.substring(star,end ));


    }
}
