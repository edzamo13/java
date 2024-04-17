package apiStream.referencia;

import apiStream.filter.Persona;

public class Comparador {

    public static int compararNombre(Persona p1, Persona p2){
        return p1.getNombre().compareTo(p2.getNombre());
    }

    public int comparePorFechaNacimiento(Persona p1, Persona p2){
        return p1.getFechaNacimiento().compareTo(p2.getFechaNacimiento());
    }
}
