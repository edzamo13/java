package ec.formos.vendor.enumerator;

import lombok.Getter;

public enum EnumType {

    GRAMOS("gr", " gramos"),
    MILILITROS("ml", " Mililitros"),
    OTHERS("o", " otro"),
    FRUIT("f", " fruta"),
    VENDOR("p", "persona");



    @Getter
    private String code;
    @Getter
    private String description;

    private EnumType(String code, String description) {
        this.code = code;
        this.description = description;
    }

}
