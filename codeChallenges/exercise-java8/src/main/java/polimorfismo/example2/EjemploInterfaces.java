package polimorfismo.example2;

public class EjemploInterfaces {
    public static void main(String[] args) {
        ClaseQueImplementaInterfaz c1 = new ClaseQueImplementaInterfaz();
        c1.saludar("Hola Mundo");

        Hija c2 = new  ClaseQueImplementaInterfaz();
        c2.saludar("Hola Mundo, otra vez");


        Base c3 = new ClaseQueImplementaInterfaz();
        c3.saludar("Hola Mundo, por tercera vez");
    }

}


