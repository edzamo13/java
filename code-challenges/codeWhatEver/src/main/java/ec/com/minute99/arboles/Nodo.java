package ec.com.minute99.arboles;

public class Nodo {
	int dato;
	Nodo izquierda, derecha;

	public Nodo(int d) {
		dato = d;
		izquierda = derecha = null;
	}

	public String toString() {
		return "Dato es: " + dato;
	}
}
