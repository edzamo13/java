package tipoAbstractosDatos;

/**
 * Un tipo abstracto de datos, también conocidos como TAD o ADT por sus siglas en inglés podría definirse como un modelo
 * matemático para definir tipos de datos. En Java normalmente los ADT, se escriben en interfaces.
 * */
public interface Pila<T> {

    void push(T t);

     T pop();

     T peek();

    boolean isEmpty();

    int size();



}


