package ec.formos.vendor.service.abstractfactory;

import ec.formos.vendor.service.beans.Ingredient;
import ec.formos.vendor.service.beans.Inventory;

public class IngredientFactory implements  InventoryAbstractFactory {

    private  Integer id;
    private String name;
    private String typeMeasure;
    private  Integer quantity;
    private String type;
    private  Double salePrice;
    private Double accounting;

    public IngredientFactory(Integer id, String name, String typeMeasure, Integer quantity, String type, Double salePrice, Double accounting) {
        this.id = id;
        this.name = name;
        this.typeMeasure = typeMeasure;
        this.quantity = quantity;
        this.type = type;
        this.salePrice = salePrice;
        this.accounting = accounting;
    }

    @Override
    public Inventory createInventory() {
        return new Ingredient(this.id,this.name,this.typeMeasure,this.quantity, this.type, this.salePrice,this.accounting);
    }


}
