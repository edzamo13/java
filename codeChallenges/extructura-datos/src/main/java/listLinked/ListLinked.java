package listLinked;

import java.util.LinkedList;

public class ListLinked {

    public static void main(String[] args) {
        LinkedList<String> strings = new LinkedList();
        strings.add("o");
        strings.addFirst("e");
        strings.addLast("a");

        for (String s : strings) {
            System.out.println(s);

        }

        strings.removeFirst();
        strings.removeLast();
        for (String s : strings) {
            System.out.println(s);

        }

        System.out.println("Contains: "+ strings.contains("o"));

    }
}
