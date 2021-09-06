package ec.com.openwebinars.service;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import ec.com.openwebinars.model.RegistroDatos;
import ec.com.openwebinars.model.TemperaturaHora;
import ec.com.openwebinars.util.Temperatura;

public class ServicioClimatologia {

	List<RegistroDatos> datos;

	public ServicioClimatologia(List<RegistroDatos> datos) {
		this.datos = datos;

	}

	/*
	 * Método que devuelve las temperaturas máximas agrupadas por provincia
	 */
	public Map<String, Optional<TemperaturaHora>> temperaturaMaximaProvincias() {
		return temperaturaMaxOMinProvincias(Temperatura.MAXIMA);
	}

	/*
	 * Método que devuelve las temperaturas mínimas agrupadas por provincia
	 */

	public Map<String, Optional<TemperaturaHora>> temperaturaMinimaProvincias() {
		return temperaturaMaxOMinProvincias(Temperatura.MINIMA);
	}

	/*
	 * Método auxiliar, que utilizan las dos anteriores, que sirva para realizar
	 * el agrupamiento, según si es escoge máximo o mínimo.
	 */
	private Map<String, Optional<TemperaturaHora>> temperaturaMaxOMinProvincias(Temperatura tipo) {
		Collector<RegistroDatos, ?, Optional<TemperaturaHora>> c = (tipo == Temperatura.MAXIMA)
				? Collectors.mapping(RegistroDatos::getMaxima,
						Collectors.maxBy((t1, t2) -> Float.compare(t1.getTemperatura(), t2.getTemperatura())))
				: Collectors.mapping(RegistroDatos::getMinima,
						Collectors.minBy((m1, m2) -> Float.compare(m1.getTemperatura(), m2.getTemperatura())));

		return datos.stream().collect(Collectors.groupingBy(RegistroDatos::getProvincia, c));
	}

}
