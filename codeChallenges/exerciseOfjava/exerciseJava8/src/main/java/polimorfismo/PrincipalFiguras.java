package polimorfismo;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class PrincipalFiguras {

    public static void main(String[] args) {


        List<Rectangulo> listaFiguras = new ArrayList<>();

        for(int i = 0; i < 10; i++) {
            listaFiguras.add(tirarMoneda() ?
                    new Rectangulo(aleatorio(50), aleatorio(50)) :
                    new Cuadrado(aleatorio(50)));
        }

        //Recorremos la lista, usando referencias de
        //tipo RECTANGULO
        for(Rectangulo r : listaFiguras) {
            System.out.println(r);
            System.out.printf("Area de la figura: %f | Perímetro de la figura: %f %n", r.getArea(), r.getPerimetro());
            System.out.println("");
        }
    }


    public static float aleatorio(int tope) {
        Random r = new Random();
        return r.nextFloat() * r.nextInt(tope);
    }

    public static boolean tirarMoneda() {
        Random r = new Random();
        boolean t= r.nextInt(2) % 2 == 0;
        System.out.println(t);
        return t;
    }
}
