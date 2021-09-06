package ec.com.openwebinars.app;

import java.time.LocalDate;
import java.util.Map;
import java.util.Optional;

import ec.com.openwebinars.model.TemperaturaHora;
import ec.com.openwebinars.service.ServicioClimatologia;
import ec.com.openwebinars.util.PrintUtil;

public class App {

	static ServicioClimatologia servicio;

	public static void main(String[] args) {

		servicio = new ServicioClimatologia(Init.getAll());
		imprimirInformeMeterologico();
	}

	private static void imprimirInformeMeterologico() {
		System.out.println("Datos Metereologicos.....Ejecutado" + LocalDate.now());
		System.out.println("*********************************+");

		//maximaYMinimaTotal();
		maximaPorProvincias();
		minimaPorProvincias();
		//mediasPorProvincias();

		//datosPorProvincia("CANTABRIA");
	}

	private static void maximaPorProvincias() {
		System.out.println("TEMPERATURA MÁXIMA POR PROVINCIAS");
		System.out.println("-----------------------------------------------------");
		Map<String, Optional<TemperaturaHora>> maximas= servicio.temperaturaMaximaProvincias();
		PrintUtil.printMapProvinciaTemperaturaHora(maximas);
	}
	
	private static void minimaPorProvincias() {
		System.out.println("TEMPERATURA MÍNIMA POR PROVINCIAS");
		System.out.println("-----------------------------------------------------");
		Map<String, Optional<TemperaturaHora>> minimas = servicio.temperaturaMinimaProvincias();
		PrintUtil.printMapProvinciaTemperaturaHora(minimas);

	}
}
