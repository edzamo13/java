package com.formos.vendor.fruit.fruit;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import com.formos.vendor.dto.Inventory;
import com.formos.vendor.dto.Person;
import com.formos.vendor.enumerador.EnumType;

import lombok.Getter;
import lombok.Setter;

/**
 * Hello world!
 *
 */
public class App {

	@Getter
	@Setter
	private static Person vendor;
	@Getter
	@Setter
	private static LoadParameter loadParameter;
	@Getter
	@Setter
	private static Scanner sn;
	@Getter
	@Setter
	private static Scanner f;
	@Getter
	@Setter
	private static Scanner m;
	@Getter
	@Setter
	private static List<Inventory> inventoriesSession;

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		sn = new Scanner(System.in);
		f = new Scanner(System.in);
		m = new Scanner(System.in);

		boolean salir = false;
		int opcion, fruit, measure;
		setLoadParameter(new LoadParameter());
		setInventoriesSession(new ArrayList<Inventory>());
		setInventoriesSession(getLoadParameter().listLoadInventories());

		while (!salir) {
			System.out.println("\n ");
			System.out.println("-------------------------------------------");
			System.out.println("------------Formos Test--------------------");
			System.out.println("Bienvenido:" + (getLoadParameter().personVendor().toString()));
			System.out.println("---------------------------------------");
			System.out.println("Escoja una Opcion:");
			System.out.println("1. List Inventory:");
			System.out.println("2. Preparation of fruit juice:");
			System.out.println("3. Sellout ");
			System.out.println("4. Out");

			try {

				System.out.println("Write one of the options:");
				opcion = getSn().nextInt();

				switch (opcion) {
				case 1:
					System.out.println("List inventory:");
					for (Inventory i : getInventoriesSession()) {
						System.out.println(i.toString());
					}

					break;
				case 2:
					System.out.println("Preparation of fruit juice");
					System.out.println("Select the number of fruit: (1,2,3):");
					System.out.println(getLoadParameter().fruits());
					fruit = getF().nextInt();
					System.out.println("Select the measurement number:(1,2,3)");
					System.out.println(getLoadParameter().typeMeasure());
					measure = getM().nextInt();
					calculePreparation(getLoadParameter().listLoadInventories(), fruit, measure);
					break;
				case 3:
					System.out.println("sellout");
					calculeSellout();

					break;
				case 4:
					System.out.println("bye!..");
					salir = true;
					break;
				default:
					System.out.println("Solo números entre 1 y 4");
				}
			} catch (InputMismatchException e) {
				System.out.println("Debes insertar un número");
				sn.next();
			}
		}
	}

	private static void calculeSellout() {
		Order order = new Order();
		ShoppingCartVisitor visitor = new ShoppingCartVisitorImpl();
		order.setInventories(getInventoriesSession());
		order.acceptSellout(visitor);

	}

	private static void calculePreparation(List<Inventory> inventories, Integer idFruit, Integer typeMeasure) {
		ShoppingCartVisitor visitor = new ShoppingCartVisitorImpl();
		Order order = new Order();
		if (validateParameterMix(idFruit, typeMeasure)) {
			order.setIdFruit(idFruit);
			order.setTypeMeasure(typeMeasure);
			order.setInventories(getInventoriesSession());
			setInventoriesSession(new ArrayList<Inventory>());
			setInventoriesSession(order.accept(visitor).getInventories());
		} else {
			System.out.println("Escoja de nuevo las Opciones:");
		}

	}

	private static Boolean validateParameterMix(Integer idFruit, Integer typeMeasure) {
		Boolean v = false;
		if (idFruit > Integer.valueOf(EnumType.QUANTITY_FRUITS.getCode())) {
			System.out.println("Fruta Seleccionada no existe");
			v = false;
		} else {
			v = true;
		}
		if (typeMeasure > Integer.valueOf(EnumType.QUANTITY_FRUITS.getCode())) {
			System.out.println("Medida Seleccionada no existe");
			v = false;
		} else {
			v = true;

		}

		return v;
	}

}
