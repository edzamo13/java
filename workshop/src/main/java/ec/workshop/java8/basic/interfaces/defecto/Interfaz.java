package ec.workshop.java8.basic.interfaces.defecto;

public interface Interfaz {
	
	public void metodo();
	
	default public void metodoPorDefecto() {
		System.out.println("Este es uno de los nuevos m�todos por defecto");
	}
	
	public static void metodoEstatico() {
		System.out.println("M�todo est�tico en un interfaz");
	}

}
