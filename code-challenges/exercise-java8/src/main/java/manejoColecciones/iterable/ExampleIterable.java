package manejoColecciones.iterable;

import java.util.Arrays;

/**
 * Concepto Iterable
 * Patrón de diseño
 * Recorre y eliminar los elementos
 * Iterador<E>: hastNext(), next(), remove()</>
 *
 * Permite usar forEach y el bucle tipo for-each
 *
 * Heredamos Collection
 * */
public class ExampleIterable {

    public static void main(String[] args) {
        Iterable<String> iterable= obtenerIterable();

        for (String s: iterable){
            System.out.println(s);
        }

        iterable.forEach(System.out::println);

    }

    private static Iterable<String> obtenerIterable() {
        return Arrays.asList("A","B","C","D");
    }

}
