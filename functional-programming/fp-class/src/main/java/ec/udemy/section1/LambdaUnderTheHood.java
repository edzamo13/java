package ec.udemy.section1;

public class LambdaUnderTheHood {

    public static void main(String[] args) {
        /*
        ec.udemy.section3.MyFuncionalInterface funcionalInterface1 = new ec.udemy.section3.MyFuncionalInterface() {
            @Override
            public void myMethod() {
                System.out.println("Implemetation 1");
            }
        };
        ec.udemy.section3.MyFuncionalInterface funcionalInterface2 = new MyFuncionalInterface() {
            @Override
            public void myMethod() {
                System.out.println("Implemetation 2");
            }
        };

         */

        MyFuncionalInterface funcionalInterface= new MyFuncionalInterface() {
            @Override
            public void myMethod() {
                System.out.println("Implementation 1");
            }
        };

        funcionalInterface.myMethod();
    }


}


