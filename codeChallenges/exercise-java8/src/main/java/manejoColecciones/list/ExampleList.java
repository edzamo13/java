package manejoColecciones.list;

import java.util.Arrays;
import java.util.List;

public class ExampleList {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("Uno","Dos","Tres","Cuatro");
        System.out.println("Ubicacion get index: "+ list.get(2) );
        list.forEach(System.out::println);

    }
}
