package ec.workshop.java8.basic.herencia.herencia.interfaces;

public interface ImprimiblePorConsola extends Imprimible {
	
	default public void printConsola(String s) {
		System.out.println(s);
	}

}
