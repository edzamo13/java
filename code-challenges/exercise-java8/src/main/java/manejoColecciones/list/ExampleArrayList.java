package manejoColecciones.list;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ExampleArrayList {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Uno");
        list.add("Dos");
        list.add("Tres");
        list.forEach(System.out::println);
        //añade con el index
        list.add(3, "Cuatro");
        //Sustituye en el index indicado
        list.set(1, "Dos - cambiado");
        list.forEach(System.out::println);
        list.remove("Uno");

        System.out.println("+++++++ ");

        for (ListIterator<String> listIterator = list.listIterator(list.size()); listIterator.hasPrevious(); ) {
            System.out.println(listIterator.previous() + " ");

        }

        List<String> list1= list.subList(0,2);
        list1.forEach( x -> System.out.println("subLits: " + x));

        list1.clear();
        System.out.println("+++++++");
        list.forEach(System.out::println);
        list1.forEach(System.out::println);

    }
}
