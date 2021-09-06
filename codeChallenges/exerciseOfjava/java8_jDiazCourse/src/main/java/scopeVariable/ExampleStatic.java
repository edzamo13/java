package scopeVariable;

public class ExampleStatic {
    /**
     * Static
     * Que pertenece a la variable de la clase
     * */

    static int id=5;

    public static void main(String[] args) {
        ExampleStatic aStatic= new ExampleStatic();
        //instance reference acces:15
        System.out.println(aStatic.id);
        //class reference acces:15
        System.out.println(ExampleStatic.id);
    }


}
