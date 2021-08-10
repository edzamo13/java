package hackerrank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BasicToken {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
      separateString(s);
        scan.close();
    }

    private static void separateString(String s){
        if (!s.trim().isEmpty()) {
            s = s.trim();
            List<String> list = Stream.of(s.split("[\\s!,?._'@]+"))
                    .map(x -> new String(x))
                    .collect(Collectors.toList());
            System.out.println(list.size());
            list.stream().forEach(System.out::println);
        } else {
            System.out.println("0");
        }


    }
}
