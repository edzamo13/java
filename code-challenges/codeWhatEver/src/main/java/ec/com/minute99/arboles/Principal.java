package ec.com.minute99.arboles;

public class Principal {
	public static void main(String[] args) {
		Arbol AB = new Arbol();

		AB.insertar(-3);
		AB.insertar(-4);
		AB.insertar(1);
		//AB.insertar(72);
		//AB.insertar(56);
		//AB.insertar(12);
		//AB.insertar(5);
	//	System.out.println("LA RAIZ ES: " + AB.raiz());

	//	System.out.println("");
	//	System.out.println("la cantidad de nodos es " + AB.cantidadNodos());

	//	System.out.println("cantidad de hojas = " + AB.cantidadNodosHoja());

		System.out.println("la altura del arbol es = " + AB.retornarAltura());
		System.out.println(" ");
	//AB.menorValor();
	//	AB.mayorValor();
		AB.imprimirNivel();

//        AB.InOrden(AB.raiz);
//        System.out.println("*******************");
//        AB.PreOrden(AB.raiz);
//        System.out.println("*******************");
//        AB.PostOrden(AB.raiz);
//        System.out.println("*******************");
//        System.out.println(AB.BuscarNodo(12));
//        AB.Eliminar(52);      
//        System.out.println("*******************");
//        System.out.println("LA RAIZ ES: "+AB.Raiz());
//        AB.PostOrden(AB.raiz);

	}
}
