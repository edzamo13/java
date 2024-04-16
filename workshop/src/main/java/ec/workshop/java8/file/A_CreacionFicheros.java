/**
 * Creaci�n de ficheros y ficheros temporales
 */
package ec.workshop.java8.file;

import java.io.File;
import java.io.IOException;

/**
 * @author Openwebinars
 *
 */
public class A_CreacionFicheros {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		try {
			File f = new File("./", "nuevo.txt");
			f.createNewFile();
			
			File temp = File.createTempFile("temporal", ".tmp");
			System.out.println(temp.getAbsolutePath());
		} catch (IOException e) {
			e.printStackTrace();
		}
		

	}

}
