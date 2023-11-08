package ec.formos.vendor.util;

import ec.formos.vendor.service.abstractfactory.IngredientFactory;
import ec.formos.vendor.service.abstractfactory.InventoryFactory;
import ec.formos.vendor.service.beans.Inventory;
import ec.formos.vendor.model.Person;
import ec.formos.vendor.enumerator.EnumType;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

public class LoadParameter {

    @Getter
    @Setter
    public List<Inventory> listLoadInventories;

    @Getter
    @Setter
    public Person person;


    public LoadParameter() {
        listLoadFactoryInventories();
        personVendor();
    }

    private void listLoadFactoryInventories() {
        List<Inventory> inventories = new ArrayList<>();
        Inventory strawberry = InventoryFactory.createInventory(new IngredientFactory(1, "Strawberry", EnumType.GRAMOS.getCode(), 1000, EnumType.FRUIT.getCode(), 1.0, 0.0));
        Inventory banana = InventoryFactory.createInventory(new IngredientFactory(2, "banana", EnumType.GRAMOS.getCode(), 1000, EnumType.FRUIT.getCode(), 1.0, 0.0));
        Inventory mango = InventoryFactory.createInventory(new IngredientFactory(3, "mango", EnumType.GRAMOS.getCode(), 1000, EnumType.FRUIT.getCode(), 1.5, 0.0));
        Inventory ice = InventoryFactory.createInventory(new IngredientFactory(4, "ice", EnumType.MILILITROS.getCode(), 1000, EnumType.OTHERS.getCode(), 0.5, 0.0));
        Inventory condensedMilk = InventoryFactory.createInventory(new IngredientFactory(5, "condensedMilk", EnumType.MILILITROS.getCode(), 1000, EnumType.OTHERS.getCode(), 1.5, 0.0));
        Inventory sugar = InventoryFactory.createInventory(new IngredientFactory(6, "sugar", EnumType.GRAMOS.getCode(), 1000, EnumType.OTHERS.getCode(), 1.5, 0.0));
        inventories.add(strawberry);
        inventories.add(banana);
        inventories.add(mango);
        inventories.add(ice);
        inventories.add(condensedMilk);
        inventories.add(sugar);
        setListLoadInventories(inventories);
    }


    private void personVendor() {
        Person person = new Person(0, "VENDOR1", EnumType.VENDOR.getCode(), "01-QUITO-PICHINCHA", "vendor@formos.com");
        setPerson(person);
    }


}
