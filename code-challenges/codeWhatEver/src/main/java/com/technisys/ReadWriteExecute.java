package com.technisys;

import java.util.ArrayList;
import java.util.List;

public class ReadWriteExecute {

	public static int symbolicToOctal(String permString) {
		Dato dato = new Dato();
		List<Dato> list = new ArrayList<Dato>();

		for (int i = 0; i < permString.length(); i++) {
			dato.setCaracter(permString.substring(i, i + 1));
			list.add(dato);
			dato = new Dato();
		}

		for (Dato d : list) {

			if (d.getCaracter().equals(Table.r.caracter)) {
				d.setValor(Table.r.getValue());
			}
			if (d.getCaracter().equals(Table.w.caracter)) {
				d.setValor(Table.w.getValue());
			}
			if (d.getCaracter().equals(Table.x.caracter)) {
				d.setValor(Table.x.getValue());
			}

			if (d.getCaracter().equals("-")) {
				d.setValor(0);
			}
		}
		int sum = 0, cont = 0;
		List<String> suma = new ArrayList<>();
		for (Dato dt : list) {
			cont ++;
			sum += dt.getValor();
			if (cont == 3) {
				suma.add(String.valueOf(sum));
				cont = 0;
				sum = 0;
			}

		}
		
		String result ="";
		for (String s : suma) {
			result+=s;
		}
		
		return Integer.valueOf(result);
	}

	public static void main(String[] args) {
		// Should write 752
		System.out.println(ReadWriteExecute.symbolicToOctal("rwxr-x-w-"));
	}

	public enum Table {
		r("r", 4), w("w", 2), x("x", 1);

		private String caracter;
		private int value;

		private Table(String caracter, int value) {
			this.caracter = caracter;
			this.value = value;
		}

		public String getCaracter() {
			return caracter;
		}

		public void setCaracter(String caracter) {
			this.caracter = caracter;
		}

		public int getValue() {
			return value;
		}

		public void setValue(int value) {
			this.value = value;
		}

	}

	public static class Dato {

		private String caracter;
		private int valor;

		public Dato() {

		}

		public String getCaracter() {
			return caracter;
		}

		public void setCaracter(String caracter) {
			this.caracter = caracter;
		}

		public int getValor() {
			return valor;
		}

		public void setValor(int valor) {
			this.valor = valor;
		}

		@Override
		public String toString() {
			return "Dato [caracter=" + caracter + ", valor=" + valor + "]";
		}

	}

}
