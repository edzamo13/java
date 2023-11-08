package apiStream.referencia;


import apiStream.filter.Persona;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class ExerciseReference {


    public static void main(String[] args) {
        List<Persona> personas = Arrays.asList(
                new Persona("Ana", LocalDate.of(1930, 12, 20)),
                new Persona("Jes�s", LocalDate.of(1931, 3, 13)),
                new Persona("Miguel", LocalDate.of(1943, 8, 1)),
                new Persona("Sim�n", LocalDate.of(1949, 5, 22)),
                new Persona("Luisa", LocalDate.of(1959, 8, 28)),
                new Persona("Antonio", LocalDate.of(1965, 4, 28)),
                new Persona("Alicia", LocalDate.of(1974, 2, 10)),
                new Persona("�ngel", LocalDate.of(1982, 10, 12)),
                new Persona("Alberto", LocalDate.of(2000, 1, 2)),
                new Persona("Maria", LocalDate.of(2002, 4, 21))
        );

        System.out.println("Ordena comparando fechas ");
        personas.sort((persona1, persona2) -> {
            return persona1.getFechaNacimiento().compareTo(persona2.getFechaNacimiento());
        });
        personas.forEach(System.out::println);

        System.out.println("Ordena comparando fechas por metodo estatico ");
        personas.sort(Persona::compararPorNombre);
        personas.forEach(System.out::println);

        System.out.println("Ordenar con referenciaa una clase ");
        personas.sort(Comparador::compararNombre);
        personas.forEach(System.out::println);

        System.out.println("Transformacion usando referencia otra clase");
        personas.stream()
                .filter(p-> p.getEdad()>=18)
                .map(p-> p.getNombre())
                .map(Estudiante::new)
                .collect(Collectors.toList())
                .forEach(i-> System.out.println("referencia clase:" + i));
                //.forEach(System.out::println);//referencia a Metodo usando sout



    }





}
