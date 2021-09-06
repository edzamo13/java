
package com.formos.vendor.fruit.fruit;

import java.util.ArrayList;
import java.util.List;

import com.formos.vendor.dto.Inventory;
import com.formos.vendor.enumerador.EnumCodInventory;

public class ShoppingCartVisitorImpl implements ShoppingCartVisitor {

	@Override
	public Order visitSellout(Order order) {
		Order o = new Order();
		Double sum = 0.0;
		for (Inventory in : order.getInventories()) {
			sum += in.getAccounting();

		}
		o.setSellout(sum);
		System.out.println("sellout:" + sum + " $");
		return o;
	}

	@Override
	public Order visitPrepareJuice(Order order) {
		return inventorIngredients(order);

	}

	private Order inventorIngredients(Order order) {
		Order order2 = new Order();
		Double tmpAccounting = 0.0;
		List<Inventory> tmpInven = new ArrayList<>();
		tmpInven = order.getInventories();

		for (Inventory i : order.getInventories()) {
			tmpAccounting = 0.0;
			if (i.getId() == Integer.valueOf(EnumCodInventory.COD_ICE.getCode())) {
				if (i.getQuantity() >= Integer.valueOf(EnumCodInventory.COD_ICE.getQuantity())) {
					tmpInven.get(i.getId() - 1)
							.setQuantity(i.getQuantity() - Integer.valueOf(EnumCodInventory.COD_ICE.getQuantity()));
					tmpAccounting = tmpInven.get(i.getId() - 1).getAccounting();
					tmpAccounting += (tmpInven.get(i.getId() - 1).getSalePrice() * order.getTypeMeasure());
					tmpInven.get(i.getId() - 1).setAccounting(tmpAccounting);
				} else {
					System.out.println("Problemas en el Inventario.");
				}
			}
			if (i.getId() == Integer.valueOf(EnumCodInventory.COD_MILK.getCode())) {
				if (i.getQuantity() >= Integer.valueOf(EnumCodInventory.COD_MILK.getQuantity())) {
					tmpInven.get(i.getId() - 1)
							.setQuantity(i.getQuantity() - Integer.valueOf(EnumCodInventory.COD_MILK.getQuantity()));
					tmpAccounting = tmpInven.get(i.getId() - 1).getAccounting();
					tmpAccounting += (tmpInven.get(i.getId() - 1).getSalePrice() * order.getTypeMeasure());
					tmpInven.get(i.getId() - 1).setAccounting(tmpAccounting);

				} else {
					System.out.println("Problemas en el Inventario.");
				}
			}
			if (i.getId() == Integer.valueOf(EnumCodInventory.COD_SUGAR.getCode())) {
				if (i.getQuantity() >= Integer.valueOf(EnumCodInventory.COD_SUGAR.getQuantity())) {
					tmpInven.get(i.getId() - 1)
							.setQuantity(i.getQuantity() - Integer.valueOf(EnumCodInventory.COD_SUGAR.getQuantity()));
					tmpAccounting = tmpInven.get(i.getId() - 1).getAccounting();
					tmpAccounting += (tmpInven.get(i.getId() - 1).getSalePrice() * order.getTypeMeasure());
					tmpInven.get(i.getId() - 1).setAccounting(tmpAccounting);

				} else {
					System.out.println("Problemas en el Inventario.");
				}
			}

			if (i.getId() == order.getIdFruit()) {
				if (i.getQuantity() >= Integer.valueOf(EnumCodInventory.COD_BANANA.getQuantity())
						* order.getTypeMeasure()) {
					tmpInven.get(i.getId() - 1)
							.setQuantity(i.getQuantity() - Integer.valueOf(EnumCodInventory.COD_BANANA.getQuantity()));
					tmpAccounting = tmpInven.get(i.getId() - 1).getAccounting();
					tmpAccounting += (tmpInven.get(i.getId() - 1).getSalePrice() * order.getTypeMeasure());
					tmpInven.get(i.getId() - 1).setAccounting(tmpAccounting);

				} else {
					System.out.println("Problemas en el Inventario.");
				}
			} else if (i.getId() == order.getIdFruit()) {
				if (i.getQuantity() >= Integer.valueOf(EnumCodInventory.COD_MANGO.getQuantity())
						* order.getTypeMeasure()) {
					tmpInven.get(i.getId() - 1)
							.setQuantity(i.getQuantity() - Integer.valueOf(EnumCodInventory.COD_MANGO.getQuantity()));
					tmpAccounting = tmpInven.get(i.getId() - 1).getAccounting();
					tmpAccounting += (tmpInven.get(i.getId() - 1).getSalePrice() * order.getTypeMeasure());
					tmpInven.get(i.getId() - 1).setAccounting(tmpAccounting);

				} else {
					System.out.println("Problemas en el Inventario.");
				}
			} else if (i.getId() == order.getIdFruit()) {
				if (i.getQuantity() >= Integer.valueOf(EnumCodInventory.COD_Strawberry.getQuantity())
						* order.getTypeMeasure()) {
					tmpInven.get(i.getId() - 1).setQuantity(
							i.getQuantity() - Integer.valueOf(EnumCodInventory.COD_Strawberry.getQuantity()));
					tmpAccounting = tmpInven.get(i.getId() - 1).getAccounting();
					tmpAccounting += (tmpInven.get(i.getId() - 1).getSalePrice() * order.getTypeMeasure());
					tmpInven.get(i.getId() - 1).setAccounting(tmpAccounting);

				} else {
					System.out.println("Problemas en el Inventario.");
				}
			}
		}

		order2.setInventories(tmpInven);
		return order2;
	}

}
