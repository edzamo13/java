package com.reactive.programming.udemy.reactive.fundamentals;



public class CallBackDemo {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Main Thread is running..");
        Runnable runnable= new Runnable() {
            @Override
            public void run() {
                try {
                    new CallBackDemo().runningAsync(new CallBack() {
                        @Override
                        public void pushData(String data) {
                            System.out.println("CAllback data: "+ data);
                        }

                        @Override
                        public void pushComplete() {
                            System.out.println("CallBack done!");
                        }

                        @Override
                        public void pushError(Exception ex) {
                            System.out.println("CallBack Error called,Got an Exception");
                        }
                    });
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        Thread thread= new Thread();
        thread.start();
        Thread.sleep(2000);
        System.out.println("Main thread Completed");
    }

    public void runningAsync(CallBack callBack) throws InterruptedException {
        System.out.println("I'm running in separate thread ");
        sleep(1000);
        callBack.pushData("data1");
        callBack.pushData("data2");
        callBack.pushData("data3");
        callBack.pushError(new RuntimeException("Upps!!"));
        callBack.pushComplete();
    }

    private void sleep(int i) {
        try {
            Thread.sleep(i);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }


}
