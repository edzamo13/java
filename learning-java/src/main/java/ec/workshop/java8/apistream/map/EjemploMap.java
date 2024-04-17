/**
 * Ejemplo de transformaci�n con .map(...)
 */
package ec.workshop.java8.apistream.map;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * @author Openwebinars
 */
public class EjemploMap {

  /**
   * @param args
   */
  public static void main(String[] args) {

    List<Persona> personas = Arrays.asList(
        new Persona("Pepe", "P�rez", LocalDate.of(1990, 1, 2)),
        new Persona("Juan", "And�valo", LocalDate.of(1991, 2, 3)),
        new Persona("Miguel", "Ramos", LocalDate.of(1992, 3, 4)),
        new Persona("Carlos", "Jim�nez", LocalDate.of(1993, 4, 5))
    );

    personas
        .stream()                         //Stream<Persona>
        .map(p -> p.getNombre() + " " + p.getApellidos())          //Stream<String>
        .map(String::toUpperCase)        //Stream<String>
        .forEach(System.out::println);
    System.out.println("");

    System.out.println("Fechas de cumplea�os");
    personas
        .stream()                          //Stream<Persona>
        .map(p -> p.getFechaNacimiento())              //Stream<LocalDate>
        .map(f -> f.format(DateTimeFormatter.ofPattern("dd-MM")))   //Stream<String>
        .forEach(System.out::println);

    List<Result> indexedNames = IntStream.range(0, personas.size())
        .mapToObj(index -> {
          String name = personas.get(index).getNombre();
          return new Result(name,index);
        })
        .collect(Collectors.toList());

    // Imprimir los objetos creados con nombre y posición (índice)
    indexedNames.forEach(obj -> {
      System.out.println("Name obj: " + obj.getName());
    });

  }


  public static class Result{
    String name;
    Integer id;

    public Result(String name, Integer id) {
      this.name = name;
      this.id = id;
    }

    public String getName() {
      return name;
    }
  }
}
