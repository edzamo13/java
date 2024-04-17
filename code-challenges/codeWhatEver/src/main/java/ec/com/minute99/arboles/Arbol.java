package ec.com.minute99.arboles;

import java.util.ArrayList;
import java.util.List;

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

	public boolean Vacio() {
		return raiz == null;
	}

	public void inOrden(Nodo r) {
		if (r != null) {
			inOrden(r.izquierda);
			System.out.print(r.dato + ",");
			inOrden(r.derecha);
		}
	}

	public void preOrden(Nodo r) {
		if (r != null) {
			System.out.print(r.dato + ",");
			preOrden(r.izquierda);
			preOrden(r.derecha);
		}
	}

	public void postOrden(Nodo r) {
		if (r != null) {
			postOrden(r.izquierda);
			postOrden(r.derecha);
			System.out.print(r.dato + ",");
		}
	}

	public Nodo buscarNodo(int d) {
		Nodo aux = raiz;
		while (aux.dato != d) {
			if (d < aux.dato) {
				aux = aux.izquierda;
			} else {
				aux = aux.derecha;
			}
			if (aux == null) {
				return null;
			}
		}
		return aux;
	}

	public boolean existe(int info) {
		Nodo reco = raiz;
		while (reco != null) {
			if (info == reco.dato) {
				return true;
			} else if (info > reco.dato) {
				reco = reco.derecha;
			} else {
				reco = reco.izquierda;
			}
		}
		return false;
	}

	private void cantidadNodosHoja(Nodo reco) {
		if (reco != null) {
			if (reco.izquierda == null && reco.derecha == null) {
				cant++;
			}
			cantidadNodosHoja(reco.izquierda);
			cantidadNodosHoja(reco.derecha);
		}
	}

	public int cantidadNodosHoja() {
		cant = 0;
		cantidadNodosHoja(raiz);
		return cant;
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

	public void menorValor() {
		if (raiz != null) {
			Nodo reco = raiz;
			while (reco.izquierda != null) {
				reco = reco.izquierda;
			}
			System.out.println("Menor valor del árbol:" + reco.dato);
		}
	}

	public void mayorValor() {
		if (raiz != null) {
			Nodo reco = raiz;
			while (reco.derecha != null) {
				reco = reco.derecha;
			}
			System.out.println("Mayor valor del árbol:" + reco.dato);
		}
	}

	int subizq = 0;
	int subder = 0;

	public void imprimirBalance() {
		subizq = 0;
		subder = 0;

		balance(this.raiz, true, 0);
		System.out.println("lado Izquierdo " + subizq + " Lado Derecho " + subder);
		if (subizq - subder == 0) {
			System.out.println("El balance es: 0 ");
		} else if (subizq - subder == -1) {
			System.out.println("El balance es -1, derecha");
		} else if (subizq - subder == 1) {
			System.out.println("El balance 1, izquierda");

		} else {
			System.out.println("No es balanceado.." + "porque es mas grande el lado "
					+ ((subizq > subder) ? "Izquierdo" : "Derecho"));
		}

	}

	public void balance(Nodo reco, boolean lado, int i) {

		if (reco != null) {

			if (reco.derecha == null && reco.izquierda == null) {
				if (lado) {
					subder = (i > subder) ? i : subder;
				} else {
					subizq = (i > subizq) ? i : subizq;
				}
			}

			balance(reco.derecha, lado, i + 1);
			if (i == 0) {
				lado = false;
			}
			balance(reco.izquierda, lado, i + 1);
		}

	}

	// altura arbol
	String[] niveles;

	List<String> busqueda;

	public List<String> imprimirNivel() {
		busqueda = new ArrayList<String>();
		niveles = new String[altura + 1];
		imprimirNivel(raiz, 0);
		for (int i = 0; i < niveles.length; i++) {
			System.out.println(niveles[i] + " En nivel: " + i);
			busqueda.add(String.valueOf(niveles[i]));
		}

		// busqueda.stream().forEach(System.out::println);

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

	public boolean Eliminar(int d) {
		Nodo auxiliar = raiz;
		Nodo padre = raiz;
		boolean hijoizq = true;
		while (auxiliar.dato != d) {
			padre = auxiliar;
			if (d < auxiliar.dato) {
				hijoizq = true;
				auxiliar = auxiliar.izquierda;
			} else {
				hijoizq = false;
				auxiliar = auxiliar.derecha;
			}
			if (auxiliar == null) {
				return false;
			}
		} // si es hoja
		if (auxiliar.izquierda == null && auxiliar.derecha == null) {
			if (auxiliar == raiz) {
				raiz = null;
			} else if (hijoizq) {
				padre.izquierda = null;
			} else {
				padre.derecha = null;
			}
		} else if (auxiliar.derecha == null) {
			if (auxiliar == raiz) {
				raiz = auxiliar.izquierda;
			} else if (hijoizq) {
				padre.izquierda = auxiliar.izquierda;
			} else {
				padre.derecha = auxiliar.izquierda;
			}
		} else if (auxiliar.izquierda == null) {
			if (auxiliar == raiz) {
				raiz = auxiliar.derecha;
			} else if (hijoizq) {
				padre.izquierda = auxiliar.derecha;
			} else {
				padre.derecha = auxiliar.derecha;
			} // es la raiz
		} else {
			Nodo reemplazo = obtenerReemplazo(auxiliar);
			if (auxiliar == raiz) {
				raiz = reemplazo;
			} else if (hijoizq) {
				padre.izquierda = reemplazo;
			} else {
				padre.derecha = reemplazo;
			}
			reemplazo.izquierda = auxiliar.izquierda;
		}
		return true;
	}

	public Nodo obtenerReemplazo(Nodo nodoreemplazo) {
		Nodo reemplazarpadre = nodoreemplazo;
		Nodo reemplazo = nodoreemplazo;
		Nodo auxiliar = nodoreemplazo.derecha;
		while (auxiliar != null) {
			reemplazarpadre = reemplazo;
			reemplazo = auxiliar;
			auxiliar = auxiliar.izquierda;
		}
		if (reemplazo != nodoreemplazo.derecha) {
			reemplazarpadre.izquierda = reemplazo.derecha;
			reemplazo.derecha = nodoreemplazo.derecha;
		}
		System.out.println("El Nodo Reemplazo es:" + reemplazo);
		return reemplazo;
	}

	public int cantidadNodos() {
		cant = 0;
		cantidad(raiz);
		return cant;
	}

	private void cantidad(Nodo reco) {
		if (reco != null) {
			cant++;
			cantidad(reco.izquierda);
			cantidad(reco.derecha);
		}
	}

	public Nodo raiz() {
		return raiz;
	}

}
