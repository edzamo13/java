package mx.com.minutos99.arboles;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import mx.com.minutos99.dto.Neighbor;

public class Arbol {

	Nodo raiz;
	int cant;
	int altura;

	public Arbol() {
		raiz = null;
	}

	public void insertar(int d) {
		Nodo nuevo = new Nodo(d);
		if (raiz == null) {
			raiz = nuevo;
		} else {
			Nodo auxiliar = raiz;
			Nodo padre;
			while (true) {
				padre = auxiliar;
				if (d < auxiliar.dato) {
					auxiliar = auxiliar.izquierda;

					if (auxiliar == null) {
						padre.izquierda = nuevo;

						return;
					}
				} else {
					auxiliar = auxiliar.derecha;
					if (auxiliar == null) {
						padre.derecha = nuevo;
						return;
					}
				}
			}
		}

	}

	public int retornarAltura() {
		altura = 0;
		retornarAltura(raiz, 1);
		return altura;
	}

	private void retornarAltura(Nodo reco, int nivel) {
		if (reco != null) {
			retornarAltura(reco.izquierda, nivel + 1);
			if (nivel > altura) {
				altura = nivel;
			}
			retornarAltura(reco.derecha, nivel + 1);
		}
	}

	int subizq = 0;
	int subder = 0;

	// altura arbol
	String[] niveles;
	List<String> busqueda;

	public List<String> imprimirNivel() {
		busqueda = new ArrayList<String>();
		niveles = new String[altura + 1];

		imprimirNivel(raiz, 0);
		for (int i = 0; i < niveles.length; i++) {
			// System.out.println(niveles[i] + " En nivel: " + i);
			busqueda.add(String.valueOf(niveles[i]));
		}

		return busqueda;
	}

	private void imprimirNivel(Nodo pivote, int nivel2) {
		if (pivote != null) {
			niveles[nivel2] = pivote.dato + ", " + ((niveles[nivel2] != null) ? niveles[nivel2] : "");
			imprimirNivel(pivote.derecha, nivel2 + 1);
			imprimirNivel(pivote.izquierda, nivel2 + 1);
		}
	}

	public void imprimirAlturaDeCadaNodo() {
		imprimirAlturaDeCadaNodo(raiz, 1);

	}

	private void imprimirAlturaDeCadaNodo(Nodo reco, int nivel) {
		if (reco != null) {
			System.out.println("Nodo contiene: " + reco.dato + " y su altura es: " + nivel);
			imprimirAlturaDeCadaNodo(reco.izquierda, nivel + 1);
			imprimirAlturaDeCadaNodo(reco.derecha, nivel + 1);
		}
	}

	public int cantidadNodos(int limite) {
		int lim = 0;
		cant = 0;
		cantidad(raiz);
		if (cant == limite)
			lim = cant;
		return lim;
	}

	private void cantidad(Nodo reco) {
		if (reco != null) {
			cant++;
			cantidad(reco.izquierda);
			cantidad(reco.derecha);
		}
	}

	int contIzquierda = 0;
	int contDerecha = 0;
	HashMap<Integer, Integer> iz;
	HashMap<Integer, Integer> de;

	private void retornarAlturaVecinos(Nodo reco, int nivel) {

		if (reco != null) {
			if (reco.izquierda != null) {
				contIzquierda++;
				iz.put(nivel, contIzquierda);
			}
			retornarAlturaVecinos(reco.izquierda, nivel + 1);

			if (nivel > altura) {
				altura = nivel;
			}
			if (reco.derecha != null) {
				contDerecha++;
				de.put(nivel, contDerecha);
			}
			retornarAlturaVecinos(reco.derecha, nivel + 1);

		}
	}

	public Neighbor retornarAlturaVecinos(int node) {
		altura = 0;
		iz = new HashMap<Integer, Integer>();
		de = new HashMap<Integer, Integer>();
		retornarAlturaVecinos(raiz, 1);
		Neighbor neighbors = new Neighbor();
		neighbors.setLeft(iz.get(node));
		neighbors.setRight(de.get(node));

		return neighbors;
	}

	public Nodo raiz() {
		return raiz;
	}

}
