package ec.workshop.java8.basic.stringbuilder;

/**
 * 
 */

/**
 * @author Openwebinars
 *
 */
public class PalindromosStringBuilder {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		String palindromo = "Dabale arroz a la zorra el abad";
        
        StringBuilder sb = new StringBuilder(palindromo);
        
        sb.reverse();  // lo invertimos
        
        System.out.println(sb); //llamada impl�cita a sb.toString().
		
		
	}

}
