/**
 * 
 */
package ec.workshop.java8.basic;

/**
 * @author Openwebinars
 *
 */
@SuppressWarnings("all")
public class TiposDatosLogicos {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		//OPERADORES L�GICOS CONDICIONALES
		int valor1 = 1;
        int valor2 = 2;
        //En el pr�ximo cap�tulo profundizamos en las sentencias condicionales
        if((valor1 == 1) && (valor2 == 2))
            System.out.println("valor1 es 1 AND valor2 es 2");
        if((valor1 == 1) || (valor2 == 1))
            System.out.println("valor1 es 1 OR valor2 es 1");
		
        
        //OPERADOR "TERNARIO"
        int result;
        boolean someCondition = false;
        result = someCondition ? valor1 : valor2;
        System.out.println(result);
        
        
        //OPERADORES L�GICOS RELACIONALES
        //En el pr�ximo cap�tulo profundizamos en las sentencias condicionales
        if(valor1 == valor2)
            System.out.println("valor1 == valor2");
        if(valor1 != valor2)
            System.out.println("valor1 != valor2");
        if(valor1 > valor2)
            System.out.println("valor1 > valor2");
        if(valor1 < valor2)
            System.out.println("valor1 < valor2");
        if(valor1 <= valor2)
            System.out.println("valor1 <= valor2");
        
		

	}
	
	

}
