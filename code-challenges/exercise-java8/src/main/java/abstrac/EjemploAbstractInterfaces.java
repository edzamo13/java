package abstrac;

public class EjemploAbstractInterfaces {
    public static void main(String[] args) {
        // bjetoGrafico  o = new ObjetoGrafico() ;

        Circulo c = new Circulo(1,1,7);
        c.dibujar();
        c.cambiarTamanio(2);
        c.moverA(3,3);
        c.dibujar();
    }
}
