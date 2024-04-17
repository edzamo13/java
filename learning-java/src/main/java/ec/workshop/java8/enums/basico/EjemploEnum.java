/**
 * 
 */
package ec.workshop.java8.enums.basico;

/**
 * @author Openwebinars
 *
 */
public class EjemploEnum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		saludaSegunDia(DiaSemana.LUNES);
		saludaSegunDia(DiaSemana.MIERCOLES);
		saludaSegunDia(DiaSemana.VIERNES);
		saludaSegunDia(DiaSemana.SABADO);
		

	}

	public static void saludaSegunDia(DiaSemana d) {
		switch (d) {
		case LUNES:
			System.out.println("Los lunes son duros :(");
			break;
		
		case VIERNES:
			System.out.println("Los viernes son mejores :)");
			break;
			
		case SABADO: case DOMINGO:
			System.out.println("Los findes son los mejores d�as :)))");
			break;
			
		default:
			System.out.println("El resto de d�as son fifty-fifty");
			break;

		}
	}

}
