package ec.udemy.section3;

@FunctionalInterface
public interface FunctionalGenerics<T, R> {

    R execute(T t);
}
