package mx.com.minutos99.arboles;

import java.util.ArrayList;
import java.util.List;

import mx.com.minutos99.dto.Neighbor;

public class ArbolService {

	public String height(List<Integer> integers) {
		Arbol arbol = new Arbol();
		for (Integer integer : integers) {
			arbol.insertar(integer);
		}
		System.out.println("La altura del arbol es = " + arbol.retornarAltura());

		return String.valueOf(arbol.retornarAltura());

	}

	public Neighbor neighbors(List<Integer> integers, int node) {
		Arbol arbol = new Arbol();
		for (Integer integer : integers) {
			arbol.insertar(integer);
		}
		return arbol.retornarAlturaVecinos(node);
	}

	public String bfs(List<Integer> integers) {
		List<String> list = new ArrayList<String>();
		Arbol arbol = new Arbol();
		for (Integer integer : integers) {
			arbol.insertar(integer);
		}
		 arbol.retornarAltura();
		list = arbol.imprimirNivel();
		list.remove("null");
		String cad = "";
		for (int i = list.size() - 1; i >= 0; i--) {

			cad += list.get(i);
		}

		return cad;

	}

	
}
