package apiStream.reduccion;

import java.util.*;


/**
 * Métodos de reducción
 * Son métodos que reducen el stream hasta dejarlo en un solo valor.
 *
 * reduce(BinaryOperator<T>):Optional<T> realiza la reducción del Stream usando una función asociativa. Devuevle un Optional
 * reduce(T, BinaryOperator<T>):T realiza la reducción usando un valor inicial y una función asociativa. Se devuelve un valor como resultado.
 *
 * Métodos de resumen
 * Son métodos que resumen todos los elementos de un stream en uno solo:
 *
 * count: devuelve el número de elementos del stream.
 * min(...), max(...): devuelven el máximo o mínimo (se puede utilizar un Comparator para modificar el orden natural).
 *
 * */
public class ExampleDato {


    public static void main(String[] args) {
        int[] array = generarArrayAleatorio();
        //Array que ayuda a la manipulacion de arrays
        System.out.println(Arrays.toString(array));
        OptionalInt maximo = Arrays.stream(array).reduce(Integer::max);
        System.out.println("maximo: " + maximo);
        String msjMaximo = maximo.isPresent() ? "El valor maximo es " + maximo.getAsInt() : "No hay valor maximo";
        System.out.println(msjMaximo);
        //reduce para suma
        int suma = Arrays.stream(array).sum();
        System.out.println("suma:" + suma);
        int numMaximo = Arrays.stream(array).max().orElse(0);
        double numMinimo = Arrays.stream(array).min().orElse(0);
        //The printf() method accepts all the integers available in the language — byte, short, int, long, and BigInteger if we use %d:
        //To format a float number, we'll need the f format:
        System.out.printf("El valor maximo es: %d y el minimo: %.2f", numMaximo, numMinimo);

        // Uso del cálculo del máximo y mínimo en otro tipo de clases
        List<String> listaPalabrasLargas = Arrays.asList("Arteriosclerosis", "Bioelectromagnetismo", "Ciclopentanoperhidrofenantreno",
                "Magnetoencefalografía", "Neurorretroalimentación");

        String maximaPalabra = listaPalabrasLargas.stream().max((cad, cad2) -> {
            //cad.length() - cad2.length();
         //   System.out.println("Paso " + cad);
            return cad.length() - cad2.length();
        }).get();

        System.out.println(maximaPalabra);
    }

    private static int[] generarArrayAleatorio() {
        return new Random().ints(100, 0, 1000).toArray();
    }
}
