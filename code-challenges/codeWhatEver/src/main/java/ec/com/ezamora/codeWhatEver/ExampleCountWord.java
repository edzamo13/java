package ec.com.ezamora.codeWhatEver;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExampleCountWord {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		String cad = scanner.nextLine();
		List<String> list = new ArrayList();

		for (int i = 0; i < cad.length(); i++) {
			list.add(cad.substring(i, i + 1));

		}

		int cont = 0;
		for (String s : list) {
			System.out.println("=>>>>>" + s);
			for (String s2 : list) {
				System.out.println(" s " + s + "  s2 " + s2);
				if (s2.equals(s)) {
					cont++;
					System.out.println(" s " + s + "  s2" + s2 + "    repite " + cont);
				}

			}

			cont = 0;

		}

	}

}
