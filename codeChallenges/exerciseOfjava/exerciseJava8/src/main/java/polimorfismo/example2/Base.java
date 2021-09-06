package polimorfismo.example2;

public interface Base {

    default public void saludar(String mensaje) {
        System.out.println(mensaje + " desde Base");
    }
}
