package ec.udemy.section7.exampleMethod;

import java.util.function.Consumer;



public class MyArrayList {

    Object[] elements = new Object[5];

    public MyArrayList(Object[] elements) {
        this.elements = elements;
    }

    public void forEach(Consumer<Object> consumer) {
        for (int i = 0; i < elements.length; i++) {
            consumer.accept( elements[i]);
        }
    }
}
