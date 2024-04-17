package hackerrank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BasicOutputFormatting {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("================================");
        List<String> resul= new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            String cad = sc.next();
            String[] cadSplit = cad.split("\\s+");
            String letter = cadSplit[0];
            String num = cadSplit[1];
            if (num.length() < 3) {
                num = "0" + num;
            } else if (num.length() < 2) {
                num = "00" + num;
            }



            //Complete this line
        }
        System.out.println("================================");

    }
}
