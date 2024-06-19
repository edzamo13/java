package com.fuctional.programing.openwebinar.features.record;


/*
Crea objetos inmutables
 */
public record Employee(Long id, String name, Double salary) {

    // opcional: crear constructores customizados
    public Employee(String name, Double salary) {
        this(null, name, salary);
    }
    public Employee(String name) {
        this(null, name, null);
    }
}
