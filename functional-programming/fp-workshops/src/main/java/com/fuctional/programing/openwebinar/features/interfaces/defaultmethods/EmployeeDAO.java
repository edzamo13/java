package com.fuctional.programing.openwebinar.features.interfaces.defaultmethods;

public interface EmployeeDAO {

    String saludo();

    default String despedida() {
        return "Hasta luego";
    }
}
