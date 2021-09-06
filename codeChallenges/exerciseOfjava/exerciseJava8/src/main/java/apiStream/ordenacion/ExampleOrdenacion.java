package apiStream.ordenacion;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 * sorted() el stream se ordena según el orden natural.
 * sorted(Comparator<T>) el stream se ordena según el orden indicado por la instancia de Comparator.
 */
public class ExampleOrdenacion {

    public static void main(String[] args) {
        int[] array = generarArrayAleatorio();
        System.out.println("Array Inicial: " + Arrays.toString(array));

        int[] arrayOrdenado = Arrays.stream(array).sorted().toArray();
        System.out.println(Arrays.toString(arrayOrdenado));

        // Uso del cálculo del máximo y mínimo en otro tipo de clases
        List<String> listaPalabras = Arrays.asList("Bioelectromagnetismo", "Ciclopentanoperhidrofenantreno",
                "Magnetoencefalografía", "Neurorretroalimentación", "Arteriosclerosis");

        listaPalabras.stream().sorted((cad, cadS) -> cad.compareTo(cadS)).forEach(System.out::println);


    }

    private static int[] generarArrayAleatorio() {
        return new Random().ints(100, 0, 1000).toArray();
    }
}
