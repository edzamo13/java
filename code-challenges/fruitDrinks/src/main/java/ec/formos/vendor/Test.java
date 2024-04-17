package ec.formos.vendor;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test {
    public static void main (String args [])
    {

        List<String> cad = new ArrayList<>();
        cad.add("0");
        cad.add("1");
        cad.add("2");
        cad.add("3");
        cad.add("4");

        System.out.println("le" + cad.subList(0,5));



        Map<Integer, String> maps= new HashMap<>();


    }

}

class MyClass {
    int iVal = 85;
    MyClass() {
        iVal = 41;
    }
    {
        iVal = 27;
    }
}