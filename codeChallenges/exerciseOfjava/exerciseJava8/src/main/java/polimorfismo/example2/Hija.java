package polimorfismo.example2;

public interface Hija extends Base{

    default public void saludar(String s) {
        System.out.println(s + " desde Hija");
    }
}
