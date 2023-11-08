package ec.formos.vendor.service;

import ec.formos.vendor.service.Visitor.JuicePreparationVisitor;
import ec.formos.vendor.service.Visitor.JuicePreparationVisitorImpl;
import ec.formos.vendor.service.beans.Inventory;
import ec.formos.vendor.enumerator.EnumTableValue;
import ec.formos.vendor.service.beans.Order;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Validation {
    public Validation() {
    }

    public static List<Inventory> calculePreparation(List<Inventory> inventories, Integer idFruit, Integer typeMeasure) {
        JuicePreparationVisitor visitor = new JuicePreparationVisitorImpl();
        Order order = new Order();

        if (validateSelections(inventories, idFruit)) {
            if (validateIngredients(inventories, idFruit)) {
                System.out.println("Can't create order because don't there ingredients :");
                order.setInventories(inventories);
            } else {
                order.setIdFruit(idFruit);
                order.setTypeMeasure(typeMeasure);
                order.setInventories(inventories);
                order.accept(visitor);
            }

        } else {
            System.out.println("Select again option not found:");
            order.setInventories(inventories);
        }
        return order.getInventories();
    }


    private static Boolean validateSelections(List<Inventory> inventories, Integer idFruit) {
        Boolean exist = false;
        if (inventories
                .stream()
                .anyMatch(f -> f.getId() == idFruit && f.getType().equals("f"))) {
            exist = true;
        }
        return exist;
    }

    private static Boolean validateIngredients(List<Inventory> inventories, Integer idFruit) {
        Boolean exist = false;

        if (inventories
                .stream()
                .anyMatch(f -> f.getId() == idFruit && f.getQuantity() <= getEnumResul(idFruit))) {
            exist = true;
        }

        List<Inventory> ices = inventories
                .stream()
                .filter(f -> f.getId() == EnumTableValue.ICE.getId() && f.getQuantity() < EnumTableValue.ICE.getQuantity())
                .collect(Collectors.toList());
        List<Inventory> milks = inventories
                .stream()
                .filter(f -> f.getId() == EnumTableValue.CONDENSED_MILK.getId() && f.getQuantity() < EnumTableValue.CONDENSED_MILK.getQuantity())
                .collect(Collectors.toList());
        List<Inventory> sugars = inventories
                .stream()
                .filter(f -> f.getId() == EnumTableValue.SUGAR.getId() && f.getQuantity() < EnumTableValue.SUGAR.getQuantity())
                .collect(Collectors.toList());

        if (!ices.isEmpty() || !milks.isEmpty() || !sugars.isEmpty()) {
            exist = true;
        }

        return exist;
    }


    private static Integer getEnumResul(Integer idFruit) {
        Integer result = Arrays.stream(EnumTableValue.values())
                .filter(e -> e.getId() == idFruit)
                .map(EnumTableValue::getQuantity)
                .findAny().get();
        return result;
    }


    private static Boolean validateSelections(List<Inventory> inventories, Integer idFruit, Integer typeMeasure) {
        Boolean exist = false;
        if (inventories
                .stream()
                .anyMatch(f -> f.getId() == idFruit && f.getType().equals("f")) && (typeMeasure <= 3)) {
            exist = true;
        }
        return exist;
    }


}
