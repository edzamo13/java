package introduccion;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@RequiredArgsConstructor
public class Example {
    private String name;


    public static void main(String[] args) {
        Example dog = new Example("Max");
        Example oldDog = dog;
        foo(dog);
    }

    private static void foo(Example dog) {
        dog.getName().equals("Max");
        dog = new Example("Fifi");
        dog.getName().equals("Fifi");
    }

}
