package edx;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MetodosGenericos {

    private static List<Integer> numList;

    public static void main(String[] args) {
        System.out.println("inicio");
        ordenarVector();
        ordenarList();
        List<Double> doubles= new ArrayList<>();
        doubles= Arrays.asList(1.2,2.3,4.0,3.0);
        ordenarTipoGenerico(doubles);

    }

    private static void ordenarVector() {
        int numeros[] = {1, 2, 3, 4, 5};
        int lo = 0;
        int hi = numeros.length - 1;
        while (lo < hi) {
            int aux = numeros[lo];
            numeros[lo] = numeros[hi];
            numeros[hi] = aux;
            lo++;
            hi--;
        }
        for (int x = 0; x <= numeros.length - 1; x++) {
            System.out.println("valor:" + numeros[x]);
        }
    }

    private static void ordenarList() {
        numList = Arrays.asList(1, 2, 3, 7, 5, 6, 4);
        numList.stream().sorted().forEach(
                x -> System.out.println("valore " + x)
        );

    }

    private static <T> void ordenarTipoGenerico(List<T> ts){
        ts.stream().sorted().forEach(
                x-> System.out.println("valor t:" + x)
        );

    }

}
