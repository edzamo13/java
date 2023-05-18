
package ec.formos.vendor.service;

import ec.formos.vendor.service.abstractfactory.IngredientFactory;
import ec.formos.vendor.service.abstractfactory.InventoryFactory;
import ec.formos.vendor.service.beans.Inventory;
import ec.formos.vendor.enumerator.EnumTableValue;
import ec.formos.vendor.enumerator.EnumType;
import ec.formos.vendor.service.beans.Order;

public class JuicePreparationVisitorImpl implements JuicePreparationVisitor {

    @Override
    public Order visitSellout(Order order) {
        double sum = order.getInventories()
                .stream()
                .mapToDouble(ob -> ob.getAccounting())
                .sum();
        order.setSellout(sum);
        System.out.println("Sellout!!:  "+ sum);
        return order;
    }

    @Override
    public Order visitPrepareJuice(Order order) {
        return inventorIngredients(order);

    }

    private Order inventorIngredients(Order order) {

        System.out.println("order" + order);
        Inventory inventory = order.getInventories()
                .stream()
                .filter(s -> s.getId() == order.getIdFruit())
                .map(i -> {
                    return getValidation(i);
                })
                .findFirst()
                .get();

        if (inventory != null) {
            Inventory remove = order.getInventories()
                    .stream()
                    .filter(in -> in.getId() == order.getIdFruit())
                    .findFirst().get();
            order.getInventories().remove(remove);
            order.getInventories().add(inventory);
        }

        Inventory sugars = getSugarInventory(order);
        removeInventory(sugars, order, EnumTableValue.SUGAR.getId());
        Inventory milk = getMilkInventory(order);
        removeInventory(milk, order, EnumTableValue.CONDENSED_MILK.getId());
        Inventory ice = getIceInventory(order);
        removeInventory(ice, order, EnumTableValue.ICE.getId());

        return order;
    }

    private static void removeInventory(Inventory sugars, Order order, int idFruit) {
        if (sugars != null) {
            Inventory remove = order.getInventories()
                    .stream()
                    .filter(sugar -> sugar.getId() == idFruit)
                    .findFirst().get();
            order.getInventories().remove(remove);
            order.getInventories().add(sugars);
        }
    }

    private static Inventory getSugarInventory(Order order) {
      return  order.getInventories()
                .stream()
                .filter(sugar -> sugar.getId() == EnumTableValue.SUGAR.getId())
                .map(s -> {
                    int quantity = s.getQuantity() - EnumTableValue.SUGAR.getQuantity();
                    double accounting = s.getSalePrice() + s.getAccounting();
                    return InventoryFactory.createInventory(new IngredientFactory(6, "sugar", EnumType.GRAMOS.getCode(), quantity, EnumType.OTHERS.getCode(), 1.5, accounting));
                })
                .findFirst()
                .get();

    }

    private static Inventory getIceInventory(Order order) {
        return order.getInventories()
                .stream()
                .filter(i -> i.getId() == EnumTableValue.ICE.getId())
                .map(s -> {
                    int quantity = s.getQuantity() - EnumTableValue.ICE.getQuantity();
                    double accounting = s.getSalePrice() + s.getAccounting();
                    return InventoryFactory.createInventory(new IngredientFactory(4, "ice", EnumType.MILILITROS.getCode(), quantity, EnumType.OTHERS.getCode(), 0.5, accounting));
                })
                .findFirst()
                .get();

    }

    private static Inventory getMilkInventory(Order order) {
        return order.getInventories()
                .stream()
                .filter(m -> m.getId() == EnumTableValue.CONDENSED_MILK.getId())
                .map(s -> {
                    int quantity = s.getQuantity() - EnumTableValue.CONDENSED_MILK.getQuantity();
                    double accounting = s.getSalePrice() + s.getAccounting();
                    return InventoryFactory.createInventory(new IngredientFactory(5, "condensedMilk", EnumType.MILILITROS.getCode(), quantity, EnumType.OTHERS.getCode(), 1.5, accounting));
                })
                .findFirst()
                .get();

    }

    private static Inventory getValidation(Inventory inventory) {
        if (inventory.getId() == EnumTableValue.STRAWBERRY.getId()) {
            int quantity = inventory.getQuantity() - EnumTableValue.STRAWBERRY.getQuantity();
            double accounting = inventory.getSalePrice() + inventory.getAccounting();
            inventory = InventoryFactory.createInventory(new IngredientFactory(1, "Strawberry", EnumType.GRAMOS.getCode(), quantity, EnumType.FRUIT.getCode(), 1.0, accounting));
        } else if (inventory.getId() == EnumTableValue.BANANA.getId()) {
            int quantity = inventory.getQuantity() - EnumTableValue.BANANA.getQuantity();
            double accounting = inventory.getSalePrice() + inventory.getAccounting();
            inventory = InventoryFactory.createInventory(new IngredientFactory(2, "banana", EnumType.GRAMOS.getCode(), quantity, EnumType.FRUIT.getCode(), 1.0, accounting));
        } else if (inventory.getId() == EnumTableValue.MANGO.getId()) {
            int quantity = inventory.getQuantity() - EnumTableValue.MANGO.getQuantity();
            double accounting = inventory.getSalePrice() + inventory.getAccounting();
            inventory = InventoryFactory.createInventory(new IngredientFactory(3, "mango", EnumType.GRAMOS.getCode(), quantity, EnumType.FRUIT.getCode(), 1.5, accounting));
        }

        return inventory;
    }

}
