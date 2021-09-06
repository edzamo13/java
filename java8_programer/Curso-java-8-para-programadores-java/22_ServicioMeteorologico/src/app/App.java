/**
 * 
 */
package app;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import model.RegistroDatos;
import model.TemperaturaHora;
import service.ServicioClimatologia;
import util.PrintUtil;

/**
 * @author Openwebinars
 *
 */
public class App {

	static ServicioClimatologia servicio;

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// Recogemos los datos e iniciamos el servicio
		servicio = new ServicioClimatologia(Init.getAll());

		//Imprimimos el informe meteorol?gico
		imprimirInformeMeteorologico();

	}

	private static void imprimirInformeMeteorologico() {

		System.out.println("DATOS METEOROL?GICOS DEL D?A 31 DE OCTUBRE DE 2017");
		System.out.println("**************************************************\n\n");
		maximaYMinimaTotal();
		maximaPorProvincias();
		minimaPorProvincias();
		mediasPorProvincias();

		datosPorProvincia("CANTABRIA");

	}

	

	private static void maximaPorProvincias() {
		System.out.println("TEMPERATURA M?XIMA POR PROVINCIAS");
		System.out.println("-----------------------------------------------------");
		Map<String, Optional<TemperaturaHora>> maximas = servicio.temperaturaMaximaProvincias();

		PrintUtil.printMapProvinciaTemperaturaHora(maximas);
	}

	private static void minimaPorProvincias() {
		System.out.println("TEMPERATURA M?NIMA POR PROVINCIAS");
		System.out.println("-----------------------------------------------------");
		Map<String, Optional<TemperaturaHora>> minimas = servicio.temperaturaMinimaProvincias();

		PrintUtil.printMapProvinciaTemperaturaHora(minimas);

	}
	
	private static void mediasPorProvincias() {
		System.out.println("TEMPERATURA MEDIA POR PROVINCIAS");
		System.out.println("-----------------------------------------------------");
		Map<String, Double> medias = servicio.temperaturaMediaProvincias();
		
		medias
			.forEach((provincia, media) -> System.out.printf("Provincia: %-25s | Media: %5.2f?C%n", provincia, media));
		System.out.println("");
	}

	private static void datosPorProvincia(String provincia) {
		System.out.println("DATOS DE LA PROVINCIA DE " + provincia.toUpperCase());
		System.out.println("-----------------------------------------------------");

		List<RegistroDatos> datos = servicio.datosProvincia(provincia);
		// Otra forma de imprimir una serie de datos de forma ordenada
		datos.stream().sorted(Comparator.comparing(RegistroDatos::getEstacionMeteorologica))
				.forEach(r -> System.out.printf(
						"Estaci?n meteorol?gica: %-35s | M?xima: % 6.2f (%s) | M?nima: % 6.2f (%s) | Precipitaci?n: %.2f%n",
						r.getEstacionMeteorologica(), r.getMaxima().getTemperatura(), r.getMaxima().getHora(),
						r.getMinima().getTemperatura(), r.getMinima().getHora(), r.getPrecipitacion()));

	}
	
	private static void maximaYMinimaTotal() {
		
		System.out.println("TEMPERATURAS M?XIMA Y M?NIMA DE ESPA?A");
		System.out.println("-----------------------------------------------------");
		
		Optional<RegistroDatos> maxima, minima;
		
		maxima = servicio.maximaTotal();
		minima = servicio.minimaTotal();
		
		// Nos aseveramos bien que el valor de Optional est? presente
		if (maxima.isPresent()) 
			System.out.printf("M?XIMA -> Estaci?n meteorol?gica: %s (%s) | Temperatura: %.2f?C | Hora: %s%n",
					maxima.get().getEstacionMeteorologica(),
					maxima.get().getProvincia(),
					maxima.get().getMaxima().getTemperatura(),
					maxima.get().getMaxima().getHora());
		else
			System.out.println("No tenemos datos sobre la temperatura m?xima");
		
		if (minima.isPresent()) 
			System.out.printf("M?NIMA -> Estaci?n meteorol?gica: %s (%s) | Temperatura: %.2f?C | Hora: %s%n",
					minima.get().getEstacionMeteorologica(),
					minima.get().getProvincia(),
					minima.get().getMinima().getTemperatura(),
					minima.get().getMinima().getHora());
		else
			System.out.println("No tenemos datos sobre la temperatura m?xima");
		
		System.out.println("");
		
	}

}
