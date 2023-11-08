package ec.formos.vendor.enumerator;

import lombok.Getter;

public enum EnumTableValue {
    STRAWBERRY(1,"300" , "?",300,"gr"),
    BANANA(2,"300" , "?",360,"gr"),
    MANGO(3,"300" , "?",420,"gr"),
    ICE(4,"300" , "",90,"ml"),
    CONDENSED_MILK(5,"300" , "",60,"ml"),
    SUGAR(6,"300" , "",24,"gr");


    @Getter
    private int id;
    @Getter
    private String milliliters;
    @Getter
    private String grams;
    @Getter
    private int quantity;
    @Getter
    private String type;


   private EnumTableValue(int id, String milliliters, String grams, int quantity, String type) {
        this.id = id;
        this.milliliters = milliliters;
        this.grams = grams;
        this.quantity = quantity;
        this.type = type;
    }
}
