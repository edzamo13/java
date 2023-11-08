package apiStream.mapAndFlapMap;

import modelo.Persona;
import modelo.Viaje;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.IntUnaryOperator;

public class ExersiceFlapMap {


    /**
     * example of same use a blucle of Person and Trip
     * <p>
     * for(Person p: persons)
     * for(Viaje v: p.getViajes())
     * System.out.println(v.getPais());
     */

    public static void main(String[] args) {

        List<Viaje> viajes = new ArrayList<>();
        viajes.add(new Viaje("España"));
        viajes.add(new Viaje("Italia"));
        viajes.add(new Viaje("Francia"));

        List<Viaje> viajes2 = new ArrayList<>();
        viajes2.add(new Viaje("Italia"));
        viajes2.add(new Viaje("Alemania"));
        viajes2.add(new Viaje("Holanda"));

        List<Viaje> viajes3 = new ArrayList<>();
        viajes3.add(new Viaje("Ecuador"));
        viajes3.add(new Viaje("Argentina"));
        viajes3.add(new Viaje("Chile"));

        List<Viaje> viajes4 = new ArrayList<>();
        viajes4.add(new Viaje("Nigeria"));
        viajes4.add(new Viaje("Egipto"));
        viajes4.add(new Viaje("Marruecos"));


        List<Persona> personas = Arrays.asList(
                new Persona("Pepe", "Perez", LocalDate.of(1990, 1, 2), viajes),
                new Persona("Maria", "Roca", LocalDate.of(1981, 2, 2), viajes2),
                new Persona("Santiago", "Pelaez", LocalDate.of(1950, 2, 2), viajes3),
                new Persona("Elvin", "Zamora", LocalDate.of(1982, 8, 2), viajes4)

        );

        System.out.println("Old Style, with blucle for");
        for (Persona p : personas) {
            for (Viaje v : p.getViajes()) {
                System.out.println("Pais :" + v.getPais());
            }
        }
        System.out.println();

        personas
                .stream()
                .map(persona -> persona.getViajes())
                .flatMap(viajess -> viajess.stream())
                .map(v -> v.getPais())
                .distinct()
                .forEach(i->{
                    System.out.println("Paises: " +i);
                });

        System.out.println();

        personas.stream()
                .forEach(p -> p.getViajes().stream().forEach(System.out::println));

        System.out.println();

        int[][] numeros= {{1,2,3,4,5,6},{2,4,6,7,8,9,5}};
        Arrays.stream(numeros)
                .flatMapToInt( n -> Arrays.stream(n))
                .map(IntUnaryOperator.identity())
                .distinct()
                .forEach(System.out::println);

    }

}
