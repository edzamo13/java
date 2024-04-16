package ec.workshop.java8.fuctionalinterfaces.nuevos;

@FunctionalInterface
public interface MiInterfaz {
	
	void print(String str);
	
	boolean equals(Object o);
	
	default void defecto() {
		System.out.println("M�todo con implementaci�n por defecto");
	}
	
	static void estatico() {
		System.out.println("M�todo est�tico");
	}

}
