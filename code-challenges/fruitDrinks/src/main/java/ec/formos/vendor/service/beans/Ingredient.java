package ec.formos.vendor.service.beans;

public class Ingredient implements Inventory {

    private  Integer id;
    private String name;
    private String typeMeasure;
    private  Integer quantity;
    private String type;
    private  Double salePrice;
    private Double accounting;

    public Ingredient(Integer id, String name, String typeMeasure, Integer quantity, String type, Double salePrice, Double accounting) {
        this.id = id;
        this.name = name;
        this.typeMeasure = typeMeasure;
        this.quantity = quantity;
        this.type = type;
        this.salePrice = salePrice;
        this.accounting = accounting;
    }

    @Override
    public String toString() {
        return "Ingredient{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", typeMeasure='" + typeMeasure + '\'' +
                ", quantity=" + quantity +
                ", type='" + type + '\'' +
                ", salePrice=" + salePrice +
                ", accounting=" + accounting +
                '}';
    }

    @Override
    public Integer getId() {
        return this.id;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getTypeMeasure() {
        return this.typeMeasure;
    }

    @Override
    public Integer getQuantity() {
        return this.quantity;
    }

    @Override
    public String getType() {
        return this.type;
    }

    @Override
    public Double getSalePrice() {
        return this.salePrice;
    }

    @Override
    public Double getAccounting() {
        return this.accounting;
    }




}
