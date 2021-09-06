package scopeVariable;

import java.io.File;
import java.util.ArrayList;

public class ExampleExerciseI {



    public static void main(String[] args) {
        ArrayList<String> existng = new ArrayList<>();

        for (String arg: args){
            System.out.println("xxx");
            System.out.println("hola +" +arg);
            if (new E().exists(arg))
                existng.add(arg);
        }
    }

}


class E{
   public boolean exists(String name){
       File f= new File(name);
       return f.exists();
   }
        }