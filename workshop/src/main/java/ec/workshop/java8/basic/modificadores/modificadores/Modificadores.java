/**
 *
 */
package ec.workshop.java8.basic.modificadores.modificadores;

import ec.workshop.java8.basic.modificadores.paquetec.C;
import ec.workshop.java8.genericas.ejemplobounded.B;


/**
 * @author Openwebinars
 *
 */
public class Modificadores {

  /**
   * @param args
   */
  public static void main(String[] args) {

    //A a = new A();  //A no es accesible, aunque est� en un subpaquete
    //	B b = new B();
    //System.out.println(b.b); //Esta opci�n no suele ser recomendable
    //System.out.println(b.getB());

    C c = new C();
    //System.out.println(c.c); //Si intentamos acceder al atributo, error
    System.out.println(c.getC());


  }

}
