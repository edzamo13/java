package ec.udemy.section4;

public class FunctionalGenericDemo {

    public static void main(String[] args) {
        FunctionalGenerics<String,String> functionalGenerics= s-> s.substring(1,5);

        System.out.println(functionalGenerics.execute("zamora"));

        FunctionalGenerics <String,Integer> functionalGenerics1= cad-> cad.length();
        System.out.println(functionalGenerics1.execute("cadena"));

        FunctionalGenerics<Integer,Integer> functionalGenerics2= a-> a +a;
        System.out.println(functionalGenerics2.execute(2));


    }
}
