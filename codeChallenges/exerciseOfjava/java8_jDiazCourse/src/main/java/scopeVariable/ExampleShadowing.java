package scopeVariable;

public class ExampleShadowing {

    static int x=0;
    int y=0;

    public static void setX(int x) {
        ExampleShadowing.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }


}
/**
 * Shadowing
 *
 * when don't use (this), or the name of class.
 * The compiler always use the variable than smaller scope
 * */

class  X{
    int a= 100;
    public void method(){
        int a= 200;//shadowing
        System.out.println(a); //200
    }
}