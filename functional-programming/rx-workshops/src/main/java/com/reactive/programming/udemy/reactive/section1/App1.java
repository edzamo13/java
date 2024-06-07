package com.reactive.programming.udemy.reactive.section1;

/**
 * Hello world!
 *
 */
public class App1
{
    /*
    public static void main( String[] args )
    {
        MyRunnable myRunnable= new MyRunnable();
        Thread thread= new Thread(myRunnable);
        thread.start();
    }*/
/*
    public static void main(String[] args) {
        Thread thread= new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread Executed!");
            }
        });
    }
*/
    /**
     * When used Lambda you need:
     * Properties
     * Name of the function
     * Parameters list
     * Body of the function
     * Return type
     * **/

    public static void main(String[] args) {
        Thread thread= new Thread( ()-> System.out.println("Thread Excuted!"));
        thread.start();

    }

}
