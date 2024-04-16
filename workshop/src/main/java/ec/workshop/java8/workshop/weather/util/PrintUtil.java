package ec.workshop.java8.workshop.weather.util;


import ec.workshop.java8.workshop.weather.model.TemperaturaHora;
import java.util.Map;
import java.util.Optional;

public class PrintUtil {

	public static void printMapProvinciaTemperaturaHora(Map<String, Optional<TemperaturaHora>> map) {

		// Una forma de imprimir un map de forma ordenada
		map.keySet().stream().sorted().forEach(provincia -> {
			TemperaturaHora t = map.get(provincia).get();
			System.out.printf("Provincia: %-25s | Temperatura: % 6.2f�C | Hora: %s%n", provincia, t.getTemperatura(),
					t.getHora().toString());
		});
		System.out.println("");
	}

}
