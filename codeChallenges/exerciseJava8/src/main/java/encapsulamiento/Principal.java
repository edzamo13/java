package encapsulamiento;

import modelo.Person;

import java.time.LocalDate;


public class Principal {

    public static void main(String[] args) {
        Person person= new Person("12345","Edwin ","Zamora", LocalDate.of(1982,5,21));
        Person person1= new Person("12346","Pedro ","Zamora", LocalDate.of(1960,5,21));
        Service  service= new Service();
        service.addPerson(person);
        service.addPerson(person1);
        service.listPersons().forEach(x-> System.out.println(x));
        service.eliminar(person1);
        System.out.println("\n" + "Elimina");
        service.listPersons().forEach(x-> System.out.println(x));
        person.setNombre("Patricio");
        service.editar(person);
        System.out.println("\n" + "Edita");
        service.listPersons().forEach(x-> System.out.println(x));
    }
}
