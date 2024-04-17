package ec.workshop.java8.basic.herencia.herencia.interfaces;

/**
 * 
 * @author Openwebinars
 *
 */
public class ClaseImprimible implements /*Imprimible,*/ ImprimiblePorConsola {

	@Override
	public void print(String s) {
		System.out.println(s);
	}
	

}
