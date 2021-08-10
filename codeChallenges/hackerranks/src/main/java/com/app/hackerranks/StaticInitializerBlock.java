package hackerrank;

public class StaticInitializerBlock {

    public static int B = 1;
    public static int H = 3;
    public static boolean flag = validate(B,H);

    public static boolean validate(int b, int h) {
        if (b < 0 || h < 0) {
            System.out.println("java.lang.Exception: Breadth and height must be positive");
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        if (flag) {
            int area = B * H;
            System.out.print(area);
        }

    }//end of main

}//end of class

