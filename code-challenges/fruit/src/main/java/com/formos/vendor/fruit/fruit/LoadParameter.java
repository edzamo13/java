package com.formos.vendor.fruit.fruit;

import java.util.ArrayList;
import java.util.List;

import com.formos.vendor.dto.Inventory;
import com.formos.vendor.dto.Person;
import com.formos.vendor.enumerador.EnumType;

public class LoadParameter {

	public static List<Inventory> listLoadInventories() {
		List<Inventory> inventoriesO = new ArrayList<>();
		inventoriesO.add(new Inventory(1, "Strawberry", EnumType.GRAMOS.getCode(), 500, EnumType.FRUIT.getCode(),1.0,0.0));
		inventoriesO.add(new Inventory(2, "Banana", EnumType.GRAMOS.getCode(), 500, EnumType.FRUIT.getCode(),1.0,0.0));
		inventoriesO.add(new Inventory(3, "Mango", EnumType.GRAMOS.getCode(), 500, EnumType.FRUIT.getCode(),1.5,0.0));
		inventoriesO.add(new Inventory(4, "Ice", EnumType.MILILITROS.getCode(), 500, EnumType.OTHERS.getCode(),0.5,0.0));
		inventoriesO.add(new Inventory(5, "Milk", EnumType.MILILITROS.getCode(), 500, EnumType.OTHERS.getCode(),1.5,0.0));
		inventoriesO.add(new Inventory(6, "Sugar:", EnumType.GRAMOS.getCode(), 500, EnumType.OTHERS.getCode(),0.5,0.0));
		return inventoriesO;
	}

	public static Person personVendor() {
		Person p = new Person(0, "VENDOR1", EnumType.VENDOR.getCode(), "01-QUITO-PICHINCHA", "vendor@formos.com");
		return p;
	}

	public static String typeMeasure() {
		int measure = 0;
		String typeMeasure = "";
		for (int i = 0; i < 3; i++) {
			measure += 100;
			typeMeasure += i + 1 + " - " + measure + "ml  ,";

		}
		return typeMeasure;
	}

	public static String fruits() {
		String fruits = "";
		for (Inventory in : listLoadInventories()) {
			if (in.getType() == EnumType.FRUIT.getCode()) {
				fruits += in.getId() + " - " + in.getName() + "  , ";
			}
		}
		return fruits;
	}

}
