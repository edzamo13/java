package herencia;



public interface ImprimibleConsola extends Imprimible {

    public default void printConsole(String s){
        System.out.println(s);
    }


}
