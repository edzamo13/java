package ec.formos.vendor.service.abstractfactory;

import ec.formos.vendor.service.beans.Inventory;

public class InventoryFactory {
    public static Inventory createInventory(InventoryAbstractFactory factory) {
        return factory.createInventory();
    }

}
