package apiStream.Basic;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ExampleStream {

    public static void main(String[] args) {
        Stream<Integer> integerStream = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        //Apartir de un Array
        IntStream intStream = Arrays.stream(new int[]{1, 2, 3, 4, 5, 6, 7, 8});
        //Stream infinito interacion de dos en dos mas limitid
        Stream<Integer> integerStreamTwoInTwo = Stream.iterate(1, x -> x + 2).limit(100);
        //integerStreamTwoInTwo.forEach(System.out::println);

        List<String> paises = Arrays.asList("Ecuador", "Peru", "Bolivia", "Venezuela", "Colombia");
        Stream<String> contengasC = paises.stream().filter(x -> x.startsWith("C"));
        contengasC.forEach(System.out::println);
        //allMatch(Predicate<T>): verifica si todos los elementos de un stream satisfacen un predicado.
        boolean paisesAllMathLongitudMayoCuatro = paises.stream().allMatch(x -> x.length() >= 4);
        System.out.println(paisesAllMathLongitudMayoCuatro);
        //anyMatch(Predicate<T>): verifica si algún elemento de un stream satisface un predicado
        boolean paisesAnyMatchContieneEcu = paises.stream().anyMatch(x -> x.contains("Ecu"));
        System.out.println(paisesAnyMatchContieneEcu);
        //noneMatch(Predicate<T>): opuesto de allMatch(…)

        //findAny(): devuelve en un Optional<T> un elemento (cualquiera) del stream. Recomendado en streams paralelos.
        //findFirst() devuelve en un Optional<T> el primer elemento del stream. NO RECOMENDADO en streams paralelos.
        System.out.println(paises.parallelStream().findAny());
        System.out.println(paises.stream().findFirst());

    }


}
