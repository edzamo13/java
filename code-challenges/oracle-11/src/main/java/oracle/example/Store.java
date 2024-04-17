package oracle.example;

import java.util.ArrayList;
import java.util.List;

public class Store {


    public static void main(String[] args) {
        Dog dog= new Dog();
        Fish fish= new Fish();
        List<Pet> pets= new ArrayList<>();
        pets.add(dog);
        pets.add(fish);
        System.out.println("test");
    }
}
