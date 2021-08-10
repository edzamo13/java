package hackerrank;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class StringIntroduction {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String cad = scanner.nextLine();
        String cad2 = scanner.nextLine();
        Integer sumCad = cad.length() + cad2.length();
        System.out.println(sumCad);
        List<String> lists = Arrays.asList(cad, cad2);
        List<String> listOrd = lists.stream().sorted().collect(Collectors.toList());
        if (listOrd.get(0).equals(cad)) {
            System.out.println("No");
        }else{
            System.out.println("Yes");
        }
        String join = "";
        for (String s : lists) {
            s=s.substring(0, 1).toUpperCase() + s.substring(1);
            join += s.concat(" ");
        }
        System.out.println(join);
    }
}
