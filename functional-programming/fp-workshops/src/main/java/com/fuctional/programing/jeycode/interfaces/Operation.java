package com.fuctional.programing.jeycode.interfaces;

@FunctionalInterface
public interface Operation {

  float operation();
  private void  interfacesPrivateMethod(){
    System.out.println("Call the method private of rhe interface");
    interfacesStaticMethod(); // podemos llamar a los mismos metodos estaticos de la misma interface
  }
  static void interfacesStaticMethod(){
    System.out.println("Call the method static of the interface");

  }
  default void  interfacesDefaultMethod(){
    interfacesPrivateMethod();
    interfacesStaticMethod();
    System.out.println("Call the Method default of the interface");
  }

}
