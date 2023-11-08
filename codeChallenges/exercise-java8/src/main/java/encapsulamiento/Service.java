package encapsulamiento;

import modelo.Person;

import java.util.ArrayList;
import java.util.List;

public class Service {

    List<Person> personList;

    public Service() {
        personList = new ArrayList<>();
    }

    public void addPerson(Person person){
        personList.add(person);
    }


    public void editar(Person person){
        for (Person p:personList) {
            if(person.getDni() == p.getDni()){
                p= person;
            }

        }
    }


    public void eliminar(Person person){
        personList.remove(person);
    }

    public List<Person> listPersons(){
        return  personList;
    }
}
