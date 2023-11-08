package introduccion;

import lombok.Getter;

import java.util.ArrayList;


@Getter
public class IntroduccionExtructuraDatos {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        System.out.println(list.size());//init 0
        addToList(list);
        System.out.println(list);// Size
    }

    private static void addToList(ArrayList<String> list) {
        list.add("hola");
    }
}
