package ec.com.openwebinars.model;

import java.time.LocalDate;

public class RegistroDatos {

	private LocalDate fecha;
	private String estacionMetereologica;
	private String provincia;
	private TemperaturaHora maxima;
	private TemperaturaHora minima;
	private float precipitacion;

	public RegistroDatos() {
	}

	public RegistroDatos(LocalDate fecha, String estacionMetereologica, String provincia, TemperaturaHora maxima,
			TemperaturaHora minima, float precipitacion) {
		this.fecha = fecha;
		this.estacionMetereologica = estacionMetereologica;
		this.provincia = provincia;
		this.maxima = maxima;
		this.minima = minima;
		this.precipitacion = precipitacion;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public String getEstacionMetereologica() {
		return estacionMetereologica;
	}

	public void setEstacionMetereologica(String estacionMetereologica) {
		this.estacionMetereologica = estacionMetereologica;
	}

	public String getProvincia() {
		return provincia;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}

	public TemperaturaHora getMaxima() {
		return maxima;
	}

	public void setMaxima(TemperaturaHora maxima) {
		this.maxima = maxima;
	}

	public TemperaturaHora getMinima() {
		return minima;
	}

	public void setMinima(TemperaturaHora minima) {
		this.minima = minima;
	}

	public float getPrecipitacion() {
		return precipitacion;
	}

	public void setPrecipitacion(float precipitacion) {
		this.precipitacion = precipitacion;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((estacionMetereologica == null) ? 0 : estacionMetereologica.hashCode());
		result = prime * result + ((fecha == null) ? 0 : fecha.hashCode());
		result = prime * result + ((maxima == null) ? 0 : maxima.hashCode());
		result = prime * result + ((minima == null) ? 0 : minima.hashCode());
		result = prime * result + Float.floatToIntBits(precipitacion);
		result = prime * result + ((provincia == null) ? 0 : provincia.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		RegistroDatos other = (RegistroDatos) obj;
		if (estacionMetereologica == null) {
			if (other.estacionMetereologica != null)
				return false;
		} else if (!estacionMetereologica.equals(other.estacionMetereologica))
			return false;
		if (fecha == null) {
			if (other.fecha != null)
				return false;
		} else if (!fecha.equals(other.fecha))
			return false;
		if (maxima == null) {
			if (other.maxima != null)
				return false;
		} else if (!maxima.equals(other.maxima))
			return false;
		if (minima == null) {
			if (other.minima != null)
				return false;
		} else if (!minima.equals(other.minima))
			return false;
		if (Float.floatToIntBits(precipitacion) != Float.floatToIntBits(other.precipitacion))
			return false;
		if (provincia == null) {
			if (other.provincia != null)
				return false;
		} else if (!provincia.equals(other.provincia))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "RegistroDatos [fecha=" + fecha + ", estacionMetereologica=" + estacionMetereologica + ", provincia="
				+ provincia + ", maxima=" + maxima + ", minima=" + minima + ", precipitacion=" + precipitacion + "]";
	}

}
