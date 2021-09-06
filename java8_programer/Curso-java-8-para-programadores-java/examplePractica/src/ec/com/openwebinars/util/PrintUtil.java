package ec.com.openwebinars.util;

import java.util.Map;
import java.util.Optional;

import ec.com.openwebinars.model.TemperaturaHora;

public class PrintUtil {

	public static void printMapProvinciaTemperaturaHora(Map<String, Optional<TemperaturaHora>> map) {
		map.keySet().stream().sorted().forEach(

				 p->{
					 TemperaturaHora t= map.get(p).get();
					 System.out.printf("Provincia: %-25s | Temperatura: % 6.2f°C | Hora: %s%n", p, t.getTemperatura(),
								t.getHora().toString());
				 }
				 
				
				);
		
	}

}
