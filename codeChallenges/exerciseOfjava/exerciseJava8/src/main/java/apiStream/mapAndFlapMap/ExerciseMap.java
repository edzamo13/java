package apiStream.mapAndFlapMap;

import modelo.Persona;

import java.text.DateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.List;

public class ExerciseMap {

    public static void main(String[] args) {
        List<Persona> personas = Arrays.asList(
                new Persona("Pepe", "Perez", LocalDate.of(1990, 1, 2)),
                new Persona("Maria", "Roca", LocalDate.of(1981, 2, 2)),
                new Persona("Santiago", "Pelaez", LocalDate.of(1950, 2, 2)),
                new Persona("Elvin", "Zamora", LocalDate.of(1982, 8, 2))

        );

        personas
                .stream()
                .map(p -> p.getNombre())
                .map(u -> u.toUpperCase())
                .forEach(System.out::println);

        System.out.println();

        personas
                .stream()
                .map(persona -> persona.getFechaNacimiento())
                .map(f-> f.format(DateTimeFormatter.ofPattern("dd-MM")))
                .forEach(System.out::println);

    }
}
